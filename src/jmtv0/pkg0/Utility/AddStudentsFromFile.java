/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmtv0.pkg0.Utility;

import Hibernate.Entity.ADDRESS;
import Hibernate.Entity.BUSFEE;
import Hibernate.Entity.CLASS;
import Hibernate.Entity.FEEBREAKUP;
import Hibernate.Entity.STUDENT;
import Hibernate.Entity.STUDENTLEDGER;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author Admin1
 */
public class AddStudentsFromFile {

    public static void main1(String[] args) {
        System.out.println("hello");
        Utility.init();
        Session ses = HibernateUtil.getSessionFactory().openSession();
        CLASS lClass = null;
        try {
            BUSFEE bf = Utility.getBusWithCity("sdf", ses);
            System.out.println(bf);
        } catch (Exception e) {

        } finally {
            ses.close();
            Utility.terminate();
        }
    }

    public static void main(String[] args) {
        System.out.println("hello");
        Utility.init();
        Session ses = HibernateUtil.getSessionFactory().openSession();
        CLASS lClass = null;
        try {
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Admin1.QA531W10X64MSO2\\Desktop\\AllStudentInformetion.csv"))) {
                String line;
                ses.beginTransaction();
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    String cols[] = line.split(",");
                    try {
                        STUDENT s = new STUDENT();
                        s.setSSO(cols[0]);
                        String dob = cols[1];
                        String osb[] = dob.split("/");
                        Calendar c = Calendar.getInstance();
                        c.set(Calendar.DATE, Integer.parseInt(osb[0].trim()));
                        c.set(Calendar.MONTH, Integer.parseInt(osb[1].trim()) - 1);
                        int yr = Integer.parseInt(osb[2].trim());
                        if (yr > 16) {
                            c.set(Calendar.YEAR, yr + 1900);
                        } else {
                            c.set(Calendar.YEAR, yr + 2000);
                        }
                        s.setDOB(c.getTime());
                        s.setFIRST_NAME(cols[2]);
                        s.setMOTHERS_NAME(cols[3]);
                        s.setFATHERS_NAME(cols[4]);
                        s.setCELL_1(cols[6]);
                        ADDRESS a = new ADDRESS();
                        BUSFEE f = null;
                        f = Utility.getBusWithCity(cols[5], ses);
                        if (f == null) {
                            f = new BUSFEE();
                            f.setVILLAGENAME(cols[5]);
                            f.setFARE((float) 0.0);
                            ses.save(f);
                        }
                        s.setCELL_1(cols[6]);
                        int id = GetClassID(cols[7]);
                        System.out.println(s + " " + id);
                        CLASS lsc = Utility.getClassWithID(id, ses);
                        if (lsc == null) {
                            JOptionPane.showMessageDialog(null, "ss");
                        } else {
                            a.setIdBusFee(f);
                            ses.save(a);
                            s.setStdntAddress(a);
                            ses.save(s);
                            {
                                s.setIdClass(lsc);
                                List lFeeBrupList = Utility.getFeeBrupListWithFeeDetailsID(
                                        lsc.getFeeDetails().getIdFeeDetails(), ses);
                                for (Object o : lFeeBrupList) {
                                    FEEBREAKUP lFeeBrup = (FEEBREAKUP) o;
                                    STUDENTLEDGER l = Utility.getStudentLDGRWithFeeBRUPIdAndSTDNTID(
                                            s.getIdStudent(),
                                            lFeeBrup.getIdFeeBRUP(),
                                            ses);
                                    if (l == null) {
                                        l = new STUDENTLEDGER();
                                        l.setSTUDENT_ID(s);
                                        l.setPENALTY(0);
                                        l.setAMT(lFeeBrup.getTotalFee());
                                        l.setAMT_TO_PAID(0);
                                        l.setAMT_TO_PAY(lFeeBrup.getTotalFee());
                                        l.setDUE_DATE(lFeeBrup.getDueDate());
                                        l.setFEES_BREAKUP_ID(lFeeBrup);
                                        ses.save(l);
                                    }
                                }
                                int lRet = -1;
                                if (s.getIdStudent() != null) {
                                    lRet = Utility.updateStudentToDB(s, ses);
                                }
                                if (lRet == 1) {
                                    System.out.println("Details stored succesfully..");
                                } else {
                                    System.out.println("Unexpected Error ouccured while saving student details ERROR CODE:" + lRet);
                                }

                            }
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                ses.getTransaction().commit();
            }
        } catch (Exception e) {
            ses.getTransaction().rollback();
        } finally {
            ses.close();
            Utility.terminate();
        }
    }

    private static int GetClassID(String col) {
        Vector<String> vct = new Vector<String>();
        vct.add("K.G.I");
        vct.add("K.G.II");
        vct.add("1st");
        vct.add("2nd");
        vct.add("3rd");
        vct.add("4th");
        vct.add("5th");
        vct.add("6th");
        vct.add("7th");
        vct.add("8th");
        vct.add("9th");
        vct.add("10th");
        vct.add("11th");
        vct.add("12th");
        return (vct.indexOf(col) + 1);
    }
}

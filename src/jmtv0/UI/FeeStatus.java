/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmtv0.UI;

import Hibernate.Entity.ADDRESS;
import Hibernate.Entity.BUSFEE;
import jmtv0.pkg0.Utility.*;
import Hibernate.Entity.CLASS;
import Hibernate.Entity.FEEBREAKUP;
import Hibernate.Entity.STUDENT;
import Hibernate.Entity.STUDENTLEDGER;
import java.awt.Point;
import java.awt.Rectangle;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jmtv0.pkg0.Utility.HibernateUtil;
import jmtv0.pkg0.Utility.TableWithButtonDemo;

//import jmtv0.pkg0.Utility.TableWithButtonDemo;
import jmtv0.pkg0.Utility.Utility;
import org.hibernate.Session;

/**
 *
 * @author Admin1
 */
public class FeeStatus extends javax.swing.JPanel {

    /**
     * Creates new form FeeSubmissionForm
     */
    private Calendar du = Calendar.getInstance();

    public FeeStatus() {
        initComponents();
        intForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudentList = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbClass = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        monthStudenList = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        statusCB = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        yearTF = new javax.swing.JTextField();

        tableStudentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableStudentList);

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Select Class");

        cbClass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Month");

        monthStudenList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" }));

        jLabel9.setText("FeeStatus");

        statusCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Un-Paid", "Paid", "Both" }));

        jLabel10.setText("Year");

        yearTF.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbClass, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthStudenList, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(yearTF, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SubmitButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2))
                                    .addComponent(statusCB, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(monthStudenList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(yearTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(SubmitButton))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            tableStudentList.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        Vector colsFeeBRUP = new Vector();
        colsFeeBRUP.add("ID");
        colsFeeBRUP.add("Name");
        colsFeeBRUP.add("SSO");
        colsFeeBRUP.add("Class");
        colsFeeBRUP.add("Month");
        colsFeeBRUP.add("Total Fee");

        colsFeeBRUP.add("Paid");
        colsFeeBRUP.add("Due");
        colsFeeBRUP.add("Status");
        Vector rows = new Vector();
        DefaultTableModel dtmStudentList = (DefaultTableModel) tableStudentList.getModel();
        Session ses = HibernateUtil.getSessionFactory().openSession();
        try {
            String lstrT = (String) cbClass.getSelectedItem();
            if (!lstrT.equalsIgnoreCase("All")) {
                int liIdClass = Integer.parseInt(lstrT.split("~")[0]);
                CLASS mClass = Utility.getClassWithID(liIdClass, ses);
                List studens = Utility.getStudentWithClassID(mClass.getIdClass(), ses);
                Calendar fc = Calendar.getInstance();
                fc.setTime(mClass.getFromYear());
                yearTF.setText(fc.get(Calendar.YEAR) + "");
                for (Object o : studens) {
                    STUDENT s = (STUDENT) o;
                    if (s != null) {
                        int mon = monthStudenList.getSelectedIndex();
                        int from = 0;
                        int to = 0;
                        if (mon == 0) {
                            from = 0;
                            to = 12;
                        } else {
                            from = mon - 1;
                            to = mon;
                        }
                        for (; from < to; from++) {
                            Vector row = new Vector();
                            String sMontName = (String) monthStudenList.getItemAt(from + 1);

                            FEEBREAKUP frb = Utility.getFeeBRUPWithFeeDetailsIDAndMonth(
                                    mClass.getFeeDetails().getIdFeeDetails(), from, ses);
                            if (frb != null) {
                                STUDENTLEDGER sld = Utility.getStudentLDGRWithFeeBRUPIdAndSTDNTID(s.getIdStudent(), frb.getIdFeeBRUP(), ses);
                                if (sld != null) {
                                    row.add(s.getIdStudent());
                                    String name = s.getFIRST_NAME();
                                    if (s.getLAST_NAME() != null) {
                                        name += s.getLAST_NAME();
                                    }
                                    row.add(name);
                                    row.add(s.getSSO());
                                    row.add(mClass.getNameOfClass());
                                    row.add(sMontName);
                                    float totalFee = frb.getTotalFee();
                                    double penalty = sld.getPENALTY();
                                    Date dueDate = frb.getDueDate();
                                    if (dueDate != null) {
                                        Calendar du = Calendar.getInstance();
                                        du.setTime(dueDate);
                                        Calendar cu = Calendar.getInstance();
                                        cu.setTime(new Date());
                                        int diffYear = cu.get(Calendar.YEAR) - du.get(Calendar.YEAR);
                                        int diffMonth = diffYear * 12 + cu.get(Calendar.MONTH) - du.get(Calendar.MONTH);
                                        if (mClass.getPenaltyCycle() == 0) {
                                            if (diffMonth > 0) {
                                                penalty = (double) totalFee
                                                        * Math.pow((1.0 + ((double) mClass.getLateFeePercent() / 100.0)), diffMonth);
                                                penalty = penalty - totalFee;
                                            }
                                        }
                                    }
                                    penalty = Utility.roundToDecimal(penalty);
                                    float grandTotla = totalFee + (float) penalty;
                                    float paid = sld.getAMT_TO_PAID();
                                    float due = grandTotla - paid;
                                    int status = statusCB.getSelectedIndex();
                                    row.add(grandTotla);
                                    row.add(paid);
                                    row.add(due);
                                    if (status == 2) {
                                        if (due > 0) {
                                            row.add("Un-Paid");
                                        } else {
                                            row.add("Paid");
                                        }
                                        rows.add(row);
                                    } else if (status == 0) {
                                        if (due > 0) {
                                            row.add("Un-Paid");
                                            rows.add(row);
                                        }
                                    } else {
                                        if (due <= 0) {
                                            row.add("Paid");
                                            rows.add(row);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                int noc = cbClass.getItemCount();
                for (int i = 1; i < noc; i++) {
                    String curC = (String) cbClass.getItemAt(i);
                    int liIdClass = Integer.parseInt(curC.split("~")[0]);
                    CLASS mClass = Utility.getClassWithID(liIdClass, ses);
                    List studens = Utility.getStudentWithClassID(mClass.getIdClass(), ses);
                    Calendar fc = Calendar.getInstance();
                    fc.setTime(mClass.getFromYear());
                    yearTF.setText(fc.get(Calendar.YEAR) + "");
                    for (Object o : studens) {
                        STUDENT s = (STUDENT) o;
                        if (s != null) {
                            int mon = monthStudenList.getSelectedIndex();
                            int from = 0;
                            int to = 0;
                            if (mon == 0) {
                                from = 0;
                                to = 12;
                            } else {
                                from = mon - 1;
                                to = mon;
                            }
                            for (; from < to; from++) {
                                Vector row = new Vector();
                                String sMontName = (String) monthStudenList.getItemAt(from + 1);
                                FEEBREAKUP frb = Utility.getFeeBRUPWithFeeDetailsIDAndMonth(
                                        mClass.getFeeDetails().getIdFeeDetails(), from, ses);
                                if (frb != null) {
                                    STUDENTLEDGER sld = Utility.getStudentLDGRWithFeeBRUPIdAndSTDNTID(s.getIdStudent(), frb.getIdFeeBRUP(), ses);
                                    if (sld != null) {
                                        row.add(s.getIdStudent());
                                        String name = s.getFIRST_NAME();
                                        if (s.getLAST_NAME() != null) {
                                            name += s.getLAST_NAME();
                                        }
                                        row.add(name);
                                        row.add(s.getSSO());
                                        row.add(mClass.getNameOfClass());
                                        row.add(sMontName);
                                        float totalFee = frb.getTotalFee();
                                        double penalty = sld.getPENALTY();
                                        Date dueDate = frb.getDueDate();
                                        if (dueDate != null) {
                                            Calendar du = Calendar.getInstance();
                                            du.setTime(dueDate);
                                            Calendar cu = Calendar.getInstance();
                                            cu.setTime(new Date());
                                            int diffYear = cu.get(Calendar.YEAR) - du.get(Calendar.YEAR);
                                            int diffMonth = diffYear * 12 + cu.get(Calendar.MONTH) - du.get(Calendar.MONTH);
                                            if (mClass.getPenaltyCycle() == 0) {
                                                if (diffMonth > 0) {
                                                    penalty = (double) totalFee
                                                            * Math.pow((1.0 + ((double) mClass.getLateFeePercent() / 100.0)), diffMonth);
                                                    penalty = penalty - totalFee;
                                                }
                                            }
                                        }
                                        penalty = Utility.roundToDecimal(penalty);
                                        float grandTotla = totalFee + (float) penalty;
                                        float paid = sld.getAMT_TO_PAID();
                                        float due = grandTotla - paid;
                                        int status = statusCB.getSelectedIndex();
                                        row.add(grandTotla);
                                        row.add(paid);
                                        row.add(due);
                                        if (status == 2) {
                                            if (due > 0) {
                                                row.add("Un-Paid");
                                            } else {
                                                row.add("Paid");
                                            }
                                            rows.add(row);
                                        } else if (status == 0) {
                                            if (due > 0) {
                                                row.add("Un-Paid");
                                                rows.add(row);
                                            }
                                        } else {
                                            if (due <= 0) {
                                                row.add("Paid");
                                                rows.add(row);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        } catch (Exception e) {
        } finally {
            ses.close();
        }
//        List studens = Utility.get
        dtmStudentList.setDataVector(rows, colsFeeBRUP);

    }//GEN-LAST:event_SubmitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitButton;
    private javax.swing.JComboBox cbClass;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox monthStudenList;
    private javax.swing.JComboBox statusCB;
    private javax.swing.JTable tableStudentList;
    private javax.swing.JTextField yearTF;
    // End of variables declaration//GEN-END:variables
    private void RefreshClassList() {
        Vector classes = Utility.getVectorOfClasses("All");
        cbClass.setModel(new DefaultComboBoxModel(classes));
    }

    private void intForm() {
        RefreshClassList();
        Vector colsFeeBRUP = new Vector();
        colsFeeBRUP.add("ID");
        colsFeeBRUP.add("Name");
        colsFeeBRUP.add("SSO");
        colsFeeBRUP.add("Month");
        colsFeeBRUP.add("Fee");
        colsFeeBRUP.add("Paid");
        colsFeeBRUP.add("Due");
        colsFeeBRUP.add("Status");
        Vector rowsFeeBRUP = new Vector();

        DefaultTableModel dtmFeeBRUP = (DefaultTableModel) tableStudentList.getModel();
        dtmFeeBRUP.setDataVector(rowsFeeBRUP, colsFeeBRUP);

    }

}
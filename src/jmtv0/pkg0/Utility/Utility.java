/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jmtv0.pkg0.Utility;

import Hibernate.Entity.ADDRESS;
import Hibernate.Entity.BUSFEE;
import Hibernate.Entity.CLASS;
import Hibernate.Entity.FEEBREAKUP;
import Hibernate.Entity.FEEDETAILS;
import Hibernate.Entity.STUDENT;
import Hibernate.Entity.STUDENTLEDGER;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jmtv0.UI.Main;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.h2.tools.Server;

/**
 *
 * @author lrmakode
 */
public class Utility {

    private static final int ERROR_CODE = -1900;
    private static final int ERR_DB_STARTUP = -1000;
    private static final int ERR_SESSION_OPEN = -2000;
    private static Session msession;
    public static final int UTIL_SUCESS = 1;
    private static Server ser;
//    public static Object getQunatityOfProduct(Integer itemCode, Session vendorSession) {
//        Criteria crt = vendorSession.createCriteria(Product.class);
//        Criterion plcon = Restrictions.eq("idProduct", itemCode);
//        crt.add(plcon);
//        List l = crt.list();
//        Product p = (Product) l.get(0);
//        crt = vendorSession.createCriteria(ProductLocation.class);
//        plcon = Restrictions.like("product", p);
//        crt.add(plcon);
//        l = crt.list();
//        int quantity = 0;
//        for (Object o : l) {
//            ProductLocation pl = (ProductLocation) o;
//            quantity += pl.getQuantity();
//        }
////        System.out.println(l.size() + p.getItemCode());
//        return quantity;
//    }
    private static boolean INITALIZED;

    public static List executeHQLQuery(String query, Session session) {
        try {
            Query q = session.createQuery(query);
            List resultList = q.list();
            return resultList;
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return null;
    }

    public static Vector getNthColumnOfVector(Vector productDataVector, int col) {
        Vector colv = new Vector();
        for (Object o : productDataVector) {
            Vector or = (Vector) o;
            if (or.get(col) != null) {
                colv.add(or.get(col).toString().toLowerCase());
            }
        }
        return colv;
    }

    static Vector getItemVectorC(Vector productDataVector, int col) {
        Vector colv = new Vector();
        for (Object o : productDataVector) {
            Vector or = (Vector) o;
            colv.add(or.get(col).toString().toLowerCase());
        }
        return colv;
    }

//    public static Product getProductWithProductId(Session vendorSession, int idProd) {
//        String qs = "from Product p where  p.idProduct='" + idProd + "'";
//        try {
//            vendorSession.beginTransaction();
//            Query q = vendorSession.createQuery(qs);
//            java.util.List resultList = q.list();
//            if (resultList.size() == 1) {
//                for (Object o : resultList) {
//                    return (Product) o;
//                }
//            }
//        } catch (HibernateException he) {
//            he.printStackTrace();
//        }
//        return null;
//    }
//
//    public static Product getProductWithName(Session vendorSession, String idProd) {
//        String qs = "from Product p where  p.itemName='" + idProd + "'";
//        try {
//            vendorSession.beginTransaction();
//            Query q = vendorSession.createQuery(qs);
//            java.util.List resultList = q.list();
//            if (resultList.size() == 1) {
//                for (Object o : resultList) {
//                    return (Product) o;
//                }
//            }
//        } catch (HibernateException he) {
//            he.printStackTrace();
//        }
//        return null;
//    }
//
//    public static Vendor getVendorWithName(Session vendorSession, String toString) {
//        String qs = "from Vendor v where  v.VName='" + toString + "'";
//        try {
//            vendorSession.beginTransaction();
//            Query q = vendorSession.createQuery(qs);
//            java.util.List resultList = q.list();
//            if (resultList.size() == 1) {
//                for (Object o : resultList) {
//                    return (Vendor) o;
//                }
//            }
//        } catch (HibernateException he) {
//            he.printStackTrace();
//        }
//        return null;
//    }
//
    public static Vector getDataVectorOfVendor() {
//        String query = "from ADDRESS";
//        
//        List l = Utility.executeHQLQuery(query, msession);
        Vector rows = new Vector();
//        Set s = vendor.getVendorProducts();
//
//        Vector dna = Utility.getProductsAlready(s);
//        for (Object o : l) {
//            Product pc = (Product) o;
//            Vector onerow = new Vector();
//            if (!dna.contains(pc.getIdProduct())) {
//                onerow.add(pc.getIdProduct());
//                onerow.add(pc.getItemName());
//                onerow.add(pc.getPurchaseRate());
//                onerow.add(Utility.getQunatityOfProduct(pc.getIdProduct(), vendorSession));
//                rows.add(onerow);
//            }
//        }
//        productDTM.setDataVector(rows, cols);
//        productDataVector = rows;
        return rows;
    }

//    private static Vector getProductsAlready(Set s) {
//        Vector con = new Vector();
//        if (s != null) {
//            for (Object o : s) {
//                VendorProduct vp = (VendorProduct) o;
//                System.out.println(vp.getProduct().getIdProduct());
//                con.add(vp.getProduct().getIdProduct());
//            }
//        }
//        return con;
//    }
//    public static VendorProduct getVendorProductWithName(VendorProductId id, Set st) {
//        for (Object o : st) {
//            VendorProduct tvp = (VendorProduct) o;
//            if (id.equals(tvp.getId())) {
//                return tvp;
//            }
//        }
//        return null;
//    }
    public static void popup(String toString) {
        JOptionPane.showMessageDialog(null, toString);
    }

//    public static Vector getVectorOfPrducts(Set vendorProducts) {
//        Vector pl = new Vector();
//        for (Object o : vendorProducts) {
//            VendorProduct vp = (VendorProduct) o;
//            pl.add(vp.getProduct().getIdProduct().toString());
//
//        }
////        System.out.println(pl);
//        return pl;
//    }
//    public static Po getPOWithId(Session ses, String name) {
//        String qs = "from Po p where p.idpo='" + name + "'";
//        try {
//            ses.beginTransaction();
//            Query q = ses.createQuery(qs);
//            java.util.List resultList = q.list();
//            if (resultList.size() == 1) {
//                for (Object o : resultList) {
//                    return (Po) o;
//                }
//            }
//        } catch (HibernateException he) {
//            he.printStackTrace();
//        }
//        return null;
//    }
//    public static float getTotalVendorBalance(Vendor vendor) {
//        Set s = vendor.getPos();
//        float bal = 0;
//        for (Object o : s) {
//            Po po = (Po) o;
//
//            bal += po.getBalance();
//        }
//        return bal;
//    }
////    public static Customerdetails getCustomerWithACNO(Session ses, int name) {
////        String qs = "from Customerdetails c where  c.idCustomerDetails='" + name + "'";
////        try {
////            ses.beginTransaction();
////            Query q = ses.createQuery(qs);
////            java.util.List resultList = q.list();
////            if (resultList.size() == 1) {
////                for (Object o : resultList) {
////                    return (Customerdetails) o;
////                }
////            }
////        } catch (HibernateException he) {
////            he.printStackTrace();
////        }
////        return null;
////    }
//    public static Vendordetails getVendorWithID(Session ses, int name) {
//        String qs = "from Vendordetails v where  v.idVendorDetails='" + name + "'";
//        try {
//            ses.beginTransaction();
//            Query q = ses.createQuery(qs);
//            java.util.List resultList = q.list();
//            if (resultList.size() == 1) {
//                for (Object o : resultList) {
//                    return (Vendordetails) o;
//                }
//            }
//        } catch (HibernateException he) {
//            he.printStackTrace();
//        }
//        return null;
//    }
//    public static So getSOWithId(Session ses, String text) {
//        String qs = "from So s where s.idso='" + text + "'";
//        try {
//            ses.beginTransaction();
//            Query q = ses.createQuery(qs);
//            java.util.List resultList = q.list();
//            if (resultList.size() == 1) {
//                for (Object o : resultList) {
//                    return (So) o;
//                }
//            }
//        } catch (HibernateException he) {
//            he.printStackTrace();
//        }
//        return null;
//    }
    public static Vector getNthColumnOfVectorNoDupAndZeroLength(Vector dataVector, int col) {
        Vector colv = new Vector();
        for (Object o : dataVector) {
            Vector or = (Vector) o;
            if (or.get(col) != null) {
                String str = or.get(col).toString().trim().toLowerCase();
                if (str.length() > 0) {
                    colv.add(str);
                }
            }
        }
        return colv;

    }

    public static void main(String[] args) {
        Calendar fromDate = Calendar.getInstance();
        Calendar toDate = Calendar.getInstance();
        toDate.add(Calendar.YEAR, 1);
        for (; fromDate.before(toDate); fromDate.add(Calendar.MONTH, 1)) {
            Vector row = new Vector();
            String month = Utility.getMonthStrFromNum(fromDate.get(Calendar.MONTH)) + "~" + fromDate.get(Calendar.YEAR);
            System.out.println(month);

        }
    }

    public static String getMonthStrFromNum(int month) {
        String str[] = {"JAN",
            "FEB",
            "MAR",
            "APR",
            "MAY",
            "JUN",
            "JUL",
            "AUG",
            "SEP",
            "OCT",
            "NOV",
            "DEC",};
        if (month < 12 && month > -1) {
            return str[month];
        } else {
            return null;
        }
    }

    public static int StringToInt(String text) {
        try {
            return Integer.parseInt(text);
        } catch (Exception e) {
            return ERROR_CODE;
        }
    }

    public static Vector getVectorOfCitiesFromBUSFEE() {
        String query = "from BUSFEE";
        List l = Utility.executeHQLQuery(query, msession);
        Vector rows = new Vector();
        for (Object o : l) {
            BUSFEE pc = (BUSFEE) o;
            if (pc.getVILLAGENAME() != null) {
                if (!rows.contains(pc.getVILLAGENAME())) {
                    if (pc.getVILLAGENAME().length() > 0) {
                        rows.add(pc.getVILLAGENAME());
                    }
                }
            }
        }
        return rows;
    }

    public static Vector getVectorOfStatesFromAddress() {
        String query = "from ADDRESS";
        List l = Utility.executeHQLQuery(query, msession);
        Vector rows = new Vector();
        for (Object o : l) {
            ADDRESS pc = (ADDRESS) o;
            if (pc.getState() != null) {
                if (!rows.contains(pc.getState())) {
                    if (pc.getState().length() > 0) {
                        rows.add(pc.getState());
                    }
                }
            }
        }
        return rows;
    }

    public static Vector getVectorOfCountryFromAddress() {
        String query = "from ADDRESS";
        List l = Utility.executeHQLQuery(query, msession);
        Vector rows = new Vector();
        for (Object o : l) {
            ADDRESS pc = (ADDRESS) o;
            if (pc.getCountry() != null) {
                if (!rows.contains(pc.getCountry())) {
                    if (pc.getCountry().length() > 0) {
                        rows.add(pc.getCountry());
                    }
                }
            }
        }
        return rows;
    }

    public static Vector getVectorOfStreetsFromAddress() {
        String query = "from ADDRESS";
        List l = Utility.executeHQLQuery(query, msession);
        Vector rows = new Vector();
        for (Object o : l) {
            ADDRESS pc = (ADDRESS) o;
            if (pc.getAddress() != null) {
                if (!rows.contains(pc.getAddress())) {
                    if (pc.getAddress().length() > 0) {
                        rows.add(pc.getAddress());
                    }
                }
            }
        }
        return rows;
    }

    private static boolean StartDBServer() {
        try {
            ser = Server.createTcpServer("-tcpAllowOthers");
            ser.start();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static int init() {
        if (!StartDBServer()) {
            return ERR_DB_STARTUP;
        }
        try {
            msession = HibernateUtil.getSessionFactory().openSession();
        } catch (Exception e) {
            return ERR_SESSION_OPEN;
        }
        INITALIZED = true;
        return UTIL_SUCESS;
    }

    public static void terminate() {
        Utility.StopDBServer();
    }

    private static void StopDBServer() {
        if (ser != null) {
            ser.stop();
        }
    }

    public static STUDENT getStudentWithID(Session ses, int id) {
        String hql = "FROM STUDENT E WHERE E.id =" + id;
        List l = Utility.executeHQLQuery(hql, ses);
        STUDENT lStudent = null;
        for (Object o : l) {
            lStudent = (STUDENT) o;
        }
        return lStudent;
    }

    public static STUDENT getStudentWithID(int id, Session ses) {
        String hql = "FROM STUDENT E WHERE E.id =" + id;
        List l = Utility.executeHQLQuery(hql, ses);
        STUDENT lStudent = null;
        for (Object o : l) {
            lStudent = (STUDENT) o;
        }
        return lStudent;
    }

    public static Vector searchStudent() {
        String query = "from STUDENT";
        Session ses = HibernateUtil.getSessionFactory().openSession();
        List l = Utility.executeHQLQuery(query, ses);
        Vector rows = new Vector();
        for (Object o : l) {
            STUDENT lStudent = (STUDENT) o;
            Vector row = new Vector();
            row.add(lStudent.getSSO());
            row.add(lStudent.getFIRST_NAME());
            row.add(lStudent.getLAST_NAME());
            row.add(lStudent.getFATHERS_NAME());
            if (lStudent.getStdntAddress() != null
                    && lStudent.getStdntAddress().getIdBusFee() != null) {
                row.add(lStudent.getStdntAddress() != null
                        ? lStudent.getStdntAddress().getIdBusFee().getVILLAGENAME()
                        : "");
            } else {
                row.add("");
            }
            row.add(lStudent.getCELL_1());
            row.add(lStudent.getCELL_2());
            row.add(lStudent.getIdStudent());
            rows.add(row);
        }
        ses.close();
        return rows;
    }

    public static int saveStudentToDB(STUDENT mStudent,Session ses) {
        if(ses == null){
            return -300;
        }
        if (mStudent != null) {
            try {
                ses.save(mStudent.getStdntAddress());
                ses.save(mStudent);
            } catch (Exception e) {
                ses.getTransaction().rollback();
                return -100;
            }
            return 1;
        }
        return -200;
    }

    public static int updateStudentToDB(STUDENT mStudent, Session ses) {
        if (mStudent != null && ses != null && mStudent.getStdntAddress() != null) {
            try {
                ses.saveOrUpdate(mStudent.getStdntAddress());
                ses.saveOrUpdate(mStudent);
            } catch (Exception e) {
                e.printStackTrace();
                ses.getTransaction().rollback();
                return -100;
            }
            return 1;
        }
        return -200;
    }

    public static ADDRESS getAddressWithId(Integer id, Session ses) {
        String hql = "FROM ADDRESS E WHERE E.id =" + id;
        List l = Utility.executeHQLQuery(hql, ses);
        ADDRESS lAd = null;
        for (Object o : l) {
            lAd = (ADDRESS) o;
        }
        return lAd;
    }

    public static Vector searchClasses() {
        String query = "from CLASS";
        Session ses = HibernateUtil.getSessionFactory().openSession();
        List l = Utility.executeHQLQuery(query, ses);
        Vector rows = new Vector();
        for (Object o : l) {
            CLASS lStudent = (CLASS) o;
            Vector row = new Vector();
            row.add(lStudent.getIdClass());
            row.add(lStudent.getNameOfClass());
            row.add(lStudent.getFromYear());
            row.add(lStudent.getPenaltyCycle());

            rows.add(row);
        }
        ses.close();
        return rows;
    }

    public static CLASS getClassWithID(int id, Session ses) {
        String hql = "FROM CLASS C WHERE C.id =" + id;
        List l = Utility.executeHQLQuery(hql, ses);
        CLASS lClass = null;
        for (Object o : l) {
            lClass = (CLASS) o;
        }
        return lClass;
    }

    public static FEEDETAILS getFeeDTLSWithID(Integer idFeeDetails, Session ses) {
        String hql = "FROM FEEDETAILS C WHERE C.id =" + idFeeDetails;
        List l = Utility.executeHQLQuery(hql, ses);
        FEEDETAILS lClass = null;
        for (Object o : l) {
            lClass = (FEEDETAILS) o;
        }
        return lClass;
    }

    public static FEEBREAKUP getFeeBRUPWithFeeDetailsIDAndMonth(Integer idFeeDetails, int d, Session ses) {
        List l = Utility.getFeeBrupListWithFeeDetailsID(idFeeDetails, ses);
        FEEBREAKUP lClass = null;
        for (Object o : l) {
            FEEBREAKUP tmp = (FEEBREAKUP) o;
            Date ds = tmp.getMonth();
            Calendar cd = Calendar.getInstance();
            cd.setTime(ds);
            if (cd.get(Calendar.MONTH) == d) {
                return tmp;
            }
        }
        return lClass;
    }

    public static Vector getVectorOfClasses(String defaultString) {
        String query = "from CLASS";
        List l = Utility.executeHQLQuery(query, msession);
        Vector rows = new Vector();
        rows.add(defaultString);
        for (Object o : l) {
            CLASS pc = (CLASS) o;
            if (pc.getNameOfClass() != null) {
                if (!rows.contains(pc.getNameOfClass())) {
                    if (pc.getNameOfClass().length() > 0) {
                        rows.add(pc.getIdClass() + "~" + pc.getNameOfClass());
                    }
                }
            }
        }
        return rows;
    }

    public static STUDENTLEDGER getStudentLDGRWithFeeBRUPIdAndSTDNTID(Integer idStudent, Integer idFeeBRUP, Session ses) {
        String hql = "FROM STUDENTLEDGER C WHERE C.STUDENT_ID =" + idStudent + " AND C.FEES_BREAKUP_ID = " + idFeeBRUP;
        List l = Utility.executeHQLQuery(hql, ses);
        STUDENTLEDGER lClass = null;
        for (Object o : l) {
            lClass = (STUDENTLEDGER) o;
        }
        return lClass;
    }

    public static List getFeeBrupListWithFeeDetailsID(Integer idClass, Session ses) {
        String hql = "FROM FEEBREAKUP C WHERE C.idFeeDTLS =" + idClass;
        List l = Utility.executeHQLQuery(hql, ses);
        return l;
    }

    public static STUDENTLEDGER getStudentLedgerWithID(int studentID, Session ses) {
        String hql = "FROM STUDENTLEDGER C WHERE C.ID =" + studentID;
        List l = Utility.executeHQLQuery(hql, ses);
        STUDENTLEDGER lClass = null;
        for (Object o : l) {
            lClass = (STUDENTLEDGER) o;
        }
        return lClass;
    }

    public static int getMonthValueFromMonthName(String mon) {
        Vector<String> vct = new Vector<String>();
        vct.add("JAN");
        vct.add("FEB");
        vct.add("MAR");
        vct.add("APR");
        vct.add("MAY");
        vct.add("JUN");
        vct.add("JUL");
        vct.add("AUG");
        vct.add("SEP");
        vct.add("OCT");
        vct.add("NOV");
        vct.add("DEC");
        return vct.indexOf(mon);
    }

    public static List getStudentWithClassID(Integer idClass, Session ses) {
        String hql = "FROM STUDENT E WHERE E.idClass =" + idClass;
        List l = Utility.executeHQLQuery(hql, ses);
        return l;
    }
    
    public static List getAllStudents(Session ses) {
        String hql = "FROM STUDENT";
        List l = Utility.executeHQLQuery(hql, ses);
        return l;
    }

    public static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static double roundToDecimal(double d) {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        return Double.valueOf(twoDForm.format(d));
    }

    public static BUSFEE getBusWithID(Integer idBusFee, Session ses) {
        String hql = "FROM BUSFEE C WHERE C.idBusFee =" + idBusFee;
        List l = Utility.executeHQLQuery(hql, ses);
        BUSFEE lClass = null;
        for (Object o : l) {
            lClass = (BUSFEE) o;
        }
        return lClass;
    }

    public static Vector searchBuses() {
        String query = "from BUSFEE";
        Session ses = HibernateUtil.getSessionFactory().openSession();
        List l = Utility.executeHQLQuery(query, ses);
        Vector rows = new Vector();
        for (Object o : l) {
            BUSFEE lStudent = (BUSFEE) o;
            Vector row = new Vector();
            row.add(lStudent.getIdBusFee());
            row.add(lStudent.getVILLAGENAME());
            row.add(lStudent.getFARE());
            row.add(lStudent.getBUSNAME());
            row.add(lStudent.getBUSNUMBER());
            row.add(lStudent.getDRIVERNAME());
            row.add(lStudent.getDRIVERCELL());
            rows.add(row);
        }
        ses.close();
        return rows;
    }

    public static BUSFEE getBusWithCity(String city, Session ses) {
        String hql = "FROM BUSFEE";
        List l = Utility.executeHQLQuery(hql, ses);
        BUSFEE b = null;
        for (Object o : l) {
            BUSFEE pc = (BUSFEE) o;
            if (pc.getVILLAGENAME() != null && (pc.getVILLAGENAME().compareToIgnoreCase(city) == 0) ) {
                b = pc;
                return b;
            }
        }
        return b;
    }

    public static void updateBalance() {
        String query = "from BUSFEE";
        Session ses = HibernateUtil.getSessionFactory().openSession();
        List l = Utility.executeHQLQuery(query, ses);
        Vector rows = new Vector();
        for (Object o : l) {
            BUSFEE lStudent = (BUSFEE) o;
            Vector row = new Vector();
            row.add(lStudent.getIdBusFee());
            row.add(lStudent.getVILLAGENAME());
            row.add(lStudent.getFARE());
            row.add(lStudent.getBUSNAME());
            row.add(lStudent.getBUSNUMBER());
            row.add(lStudent.getDRIVERNAME());
            row.add(lStudent.getDRIVERCELL());
            rows.add(row);
        }
        ses.close();

    }

}

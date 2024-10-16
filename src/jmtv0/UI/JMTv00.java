/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmtv0.UI;
import jmtv0.pkg0.Utility.HibernateUtil;
import Hibernate.Entity.ADDRESS;
import Hibernate.Entity.STUDENT;
import org.hibernate.Session;
/**
 *
 * @author lrmakode
 */
public class JMTv00 {

    /**
     * @param args the command line arguments
     */
    public static void main1(String[] args) {
        // TODO code application logic here
        Session ses = HibernateUtil.getSessionFactory().openSession();
        ADDRESS ad = new ADDRESS();
        STUDENT sd = new STUDENT();
        sd.setFIRST_NAME("Lokesh");
        ses.beginTransaction();
       
        ses.save(ad);
        sd.setStdntAddress(ad);
        ses.save(sd);
        System.out.println(ad.getIdAddress()+"");
        ses.getTransaction().commit();
        System.out.println(ad.getIdAddress());
        System.out.println("heklo");
        ses.close();
    }
    
}

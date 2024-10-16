/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmtv0.UI;

import Hibernate.Entity.CLASS;
import Hibernate.Entity.FEEBREAKUP;
import Hibernate.Entity.STUDENT;
import Hibernate.Entity.STUDENTLEDGER;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import jmtv0.pkg0.Utility.AddCustomerSO;
import jmtv0.pkg0.Utility.HibernateUtil;
import jmtv0.pkg0.Utility.UpdateFormData;
import jmtv0.pkg0.Utility.Utility;
import org.hibernate.Session;

/**
 *
 * @author Admin1
 */
public class StudentRegistration extends javax.swing.JPanel implements UpdateFormData{

    /**
     * Creates new form StudentRegistration
     */
    private AddCustomerSO apo = null;

    public StudentRegistration() {
        initComponents();
        initForm();
        apo = new AddCustomerSO(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfFatherName = new javax.swing.JTextField();
        tfClass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfSSO = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        tfIdStdnt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbClass = new javax.swing.JComboBox();
        RefreshButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SaveOrUpdet = new javax.swing.JButton();
        cancleButton = new javax.swing.JButton();
        CleareButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        tfFatherName.setEditable(false);

        tfClass.setEditable(false);

        jLabel3.setText("Existing Class");

        jLabel4.setText("Name");

        tfName.setEditable(false);

        tfSSO.setEditable(false);

        AddButton.setText("+");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        tfIdStdnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdStdntActionPerformed(evt);
            }
        });
        tfIdStdnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfIdStdntKeyTyped(evt);
            }
        });

        jLabel5.setText("SelectStudent SrNumber");

        jLabel11.setText("Select New Class");

        RefreshButton.setText("Refresh List");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Registration ");

        SaveOrUpdet.setText("Save/Update");
        SaveOrUpdet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveOrUpdetActionPerformed(evt);
            }
        });

        cancleButton.setText("Cancle/Reset");
        cancleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleButtonActionPerformed(evt);
            }
        });

        CleareButton.setText("Clear");
        CleareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleareButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("SSO");

        jLabel7.setText("Father Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(SaveOrUpdet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancleButton))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfIdStdnt)
                                    .addComponent(tfName)
                                    .addComponent(tfClass, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddButton)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(cbClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CleareButton)
                            .addComponent(RefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(tfFatherName)
                            .addComponent(tfSSO))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfIdStdnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddButton))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(tfClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CleareButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RefreshButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveOrUpdet)
                    .addComponent(cancleButton))
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfIdStdntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdStdntActionPerformed
        updateFrData();
    }//GEN-LAST:event_tfIdStdntActionPerformed

    private void tfIdStdntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdStdntKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9'))
                && (caracter != '\b') && (caracter != '.')) {
            evt.consume();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_tfIdStdntKeyTyped

    private void SaveOrUpdetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveOrUpdetActionPerformed
        Session ses = HibernateUtil.getSessionFactory().openSession();
        String sso = tfIdStdnt.getText();
        try {
            int idStudent = Integer.parseInt(sso);
            ses.beginTransaction();
            STUDENT mStudent = Utility.getStudentWithID(ses, idStudent);
            if (mStudent != null) {
                String lstrT = (String) cbClass.getSelectedItem();
                if (!lstrT.equalsIgnoreCase("Not Enrolled")) {
                    int liIdClass = Integer.parseInt(lstrT.split("~")[0]);
                    CLASS lCls = Utility.getClassWithID(liIdClass, ses);
                    if (lCls != null) {
                        mStudent.setIdClass(lCls);
                        List lFeeBrupList = Utility.getFeeBrupListWithFeeDetailsID(
                                lCls.getFeeDetails().getIdFeeDetails(), ses);
                        for (Object o : lFeeBrupList) {
                            FEEBREAKUP lFeeBrup = (FEEBREAKUP) o;
                            STUDENTLEDGER l = Utility.getStudentLDGRWithFeeBRUPIdAndSTDNTID(
                                    mStudent.getIdStudent(),
                                    lFeeBrup.getIdFeeBRUP(),
                                    ses);
                            if (l == null) {
                                l = new STUDENTLEDGER();
                                l.setSTUDENT_ID(mStudent);
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
                        if (mStudent.getIdStudent() != null) {
                            lRet = Utility.updateStudentToDB(mStudent, ses);
                        }
                        if (lRet == 1) {
                            JOptionPane.showMessageDialog(this, "Details stored succesfully..");
                            SaveOrUpdet.setEnabled(false);
                            ses.getTransaction().commit();
                            cancleButton.setEnabled(false);
                            tfIdStdnt.setEditable(true);

                        } else {
                            JOptionPane.showMessageDialog(this, "Unexpected Error ouccured while saving student details ERROR CODE:" + lRet);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid Class");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "No Student with this id");
            }

        } catch (Exception e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            ses.close();
        }
    }//GEN-LAST:event_SaveOrUpdetActionPerformed

    private void CleareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleareButtonActionPerformed
        initForm();
        // TODO add your handling code here:
    }//GEN-LAST:event_CleareButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        RefreshClassList();        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshButtonActionPerformed

    private void cancleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleButtonActionPerformed
        initForm();        // TODO add your handling code here:
    }//GEN-LAST:event_cancleButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:        
        openCustomerSelectionDialog(tfIdStdnt.getBounds());

    }//GEN-LAST:event_AddButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton CleareButton;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JButton SaveOrUpdet;
    private javax.swing.JButton cancleButton;
    private javax.swing.JComboBox cbClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tfClass;
    private javax.swing.JTextField tfFatherName;
    private javax.swing.JTextField tfIdStdnt;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfSSO;
    // End of variables declaration//GEN-END:variables

    private void initForm() {
        RefreshClassList();
        tfIdStdnt.setEditable(true);
        tfIdStdnt.setText("");
        CleareButton.setEnabled(false);
        AddButton.setEnabled(true);
        SaveOrUpdet.setEnabled(false);

        tfClass.setText("");
        tfFatherName.setText("");
        tfName.setText("");
        tfSSO.setText("");
    }

    private void RefreshClassList() {
        Vector classes = Utility.getVectorOfClasses("Not Enrolled");
        cbClass.setModel(new DefaultComboBoxModel(classes));
    }

    private void openCustomerSelectionDialog(Rectangle bounds) {
        apo.setBounds(400, 400, 500, 500);
        Point p = tfIdStdnt.getLocationOnScreen();
        apo.setLocation(p.x, p.y + tfIdStdnt.getSize().height);
        apo.setVisible(true);
    }

    @Override
    public void updateVNData(int id) {
        tfIdStdnt.setText(id+"");
        updateFrData();
    }

    private void updateFrData() {
        String sso = tfIdStdnt.getText();
        if (sso.length() > 0) {
            Session ses = HibernateUtil.getSessionFactory().openSession();
            try {
                int idStudent = Integer.parseInt(sso);
                STUDENT lStdnt = Utility.getStudentWithID(ses, idStudent);
                if (lStdnt != null) {
                    tfName.setText(lStdnt.getFIRST_NAME() + " " + lStdnt.getMIDDLE_NAME() + " " + lStdnt.getLAST_NAME());
                    tfFatherName.setText(lStdnt.getFATHERS_NAME());
                    tfSSO.setText(lStdnt.getSSO());
                    CleareButton.setEnabled(true);
                    SaveOrUpdet.setEnabled(true);
                    AddButton.setEnabled(false);
                    tfIdStdnt.setEditable(false);
                    CLASS lClass = lStdnt.getIdClass();
                    if (lClass != null) {
                        System.out.println(lClass.getNameOfClass());
                        tfClass.setText(lClass.getIdClass() + "~" + lClass.getNameOfClass());
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "No Student with this id");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                ses.close();
            }
        }    }
}

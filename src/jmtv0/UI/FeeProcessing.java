/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmtv0.UI;

import Hibernate.Entity.STUDENTLEDGER;
import javax.swing.JOptionPane;
import jmtv0.pkg0.Utility.ClientsTableRenderer;
import jmtv0.pkg0.Utility.HibernateUtil;
import jmtv0.pkg0.Utility.Utility;
import org.hibernate.Session;

/**
 *
 * @author lrmakode
 */
public class FeeProcessing extends javax.swing.JFrame {

    /**
     * Creates new form FeeProcessing
     */
    ClientsTableRenderer cltr;

    public FeeProcessing(ClientsTableRenderer aThis) {
        cltr = aThis;
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfTotalFee = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfAlrdyPaid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfTotalPaid = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfAfPay = new javax.swing.JTextField();

        jLabel1.setText("Total Fee");

        tfTotalFee.setEditable(false);

        jLabel2.setText("Alread Paid");

        tfAlrdyPaid.setEditable(false);

        jLabel3.setText("Enter Amt Here");

        tfTotalPaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTotalPaidKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfTotalPaidKeyReleased(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Cancle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("After Payment");

        tfAfPay.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfTotalFee, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfAlrdyPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfTotalPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(SubmitButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfAfPay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfTotalFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfAlrdyPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfTotalPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfAfPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton)
                    .addComponent(jButton2))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTotalPaidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTotalPaidKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9'))
                && (caracter != '\b') && (caracter != '.')) {
            evt.consume();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_tfTotalPaidKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        Session ses = HibernateUtil.getSessionFactory().openSession();
        try {
            int studentID = (Integer) cltr.table.getValueAt(cltr.row, 0);
            STUDENTLEDGER lstudentLDGR = Utility.getStudentLedgerWithID(studentID, ses);
            if (lstudentLDGR != null) {
                lstudentLDGR.setAMT_TO_PAID(Float.parseFloat(tfTotalFee.getText())
                        - Float.parseFloat(tfAfPay.getText()));
                lstudentLDGR.setAMT(Float.parseFloat(tfTotalFee.getText()));
                lstudentLDGR.setAMT_TO_PAY(Float.parseFloat(tfAfPay.getText()));
                ses.beginTransaction();
                try {
                    ses.update(lstudentLDGR);
                    ses.getTransaction().commit();
                    setVisible(false);
                } catch (Exception e) {
                    ses.getTransaction().rollback();
                }
                cltr.table.setValueAt(
                        Float.parseFloat(tfTotalFee.getText()) - Float.parseFloat(tfAfPay.getText()), cltr.row, 11);
                cltr.table.setValueAt(Float.parseFloat(tfAfPay.getText()), cltr.row, 12);
            } else {
                JOptionPane.showConfirmDialog(cltr.button, "Some Error Please try again");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(cltr.button, "Enter valid Input");
        } finally {
            ses.close();
        }

    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void tfTotalPaidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTotalPaidKeyReleased
        try {
            tfAfPay.setText("" + (Float.parseFloat(tfTotalFee.getText())
                    - (Float.parseFloat(tfAlrdyPaid.getText())
                    + Float.parseFloat(tfTotalPaid.getText())))
            );
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tfTotalPaidKeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfAfPay;
    private javax.swing.JTextField tfAlrdyPaid;
    private javax.swing.JTextField tfTotalFee;
    private javax.swing.JTextField tfTotalPaid;
    // End of variables declaration//GEN-END:variables

    public void updateData() {
        float due = 0;
        if (cltr.table.getValueAt(cltr.row, 12).getClass() == Float.class) {
            due = (Float) cltr.table.getValueAt(cltr.row, 12);
        } else {
            due = Float.parseFloat((String) cltr.table.getValueAt(cltr.row, 12));
        }
        float totalPaid = 0;
        if (cltr.table.getValueAt(cltr.row, 11).getClass() == Float.class) {
            totalPaid = (Float) cltr.table.getValueAt(cltr.row, 11);
        } else {
            totalPaid = Float.parseFloat((String) cltr.table.getValueAt(cltr.row, 11));
        }
        float totFee = 0;
        if (cltr.table.getValueAt(cltr.row, 10).getClass() == Float.class) {
            totFee = (Float) cltr.table.getValueAt(cltr.row, 10);;
        } else {
            totFee = Float.parseFloat((String) cltr.table.getValueAt(cltr.row, 10));
        }
        tfTotalFee.setText(totFee + "");
        tfAlrdyPaid.setText(totalPaid + "");
        tfAfPay.setText(due + "");
    }
}

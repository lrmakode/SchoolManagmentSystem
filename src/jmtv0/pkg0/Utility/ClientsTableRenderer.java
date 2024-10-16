/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmtv0.pkg0.Utility;

import Hibernate.Entity.STUDENTLEDGER;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import jmtv0.UI.FeeProcessing;
import org.hibernate.Session;

public class ClientsTableRenderer extends DefaultCellEditor {

    public JButton button;
    private String label;
    private boolean clicked;
    public int row, col;
    public JTable table;
    public FeeProcessing feePrFo;

    public ClientsTableRenderer(JCheckBox checkBox) {
        super(checkBox);
        feePrFo = new FeeProcessing(this);
        button = new JButton();
        button.setOpaque(true);
        feePrFo.setVisible(false);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped();
            }
        });
    }

    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.table = table;
        this.row = row;
        this.col = column;

        button.setForeground(Color.black);
        button.setBackground(UIManager.getColor("Button.background"));
        label = (value == null) ? "" : value.toString();
        button.setText(label);
        clicked = true;
        return button;
    }

    public Object getCellEditorValue() {
        if (clicked) {
            float due = 0;
            if (table.getValueAt(row, 12)!= null && (table.getValueAt(row, 12).getClass() == Float.class)) {
                due = (Float) table.getValueAt(row, 12);
            } else {
                due = Float.parseFloat((String)table.getValueAt(row, 12));
            }
            if (due > 0) {
                feePrFo.setAlwaysOnTop(true);
                feePrFo.updateData();
                Point p = button.getLocationOnScreen();
                feePrFo.setLocation(p.x-feePrFo.getWidth(), p.y);

                feePrFo.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(button, "Already Fee Paid");
            }
        }
        clicked = false;

        return new String(label);
    }

    public boolean stopCellEditing() {
        clicked = false;
        return super.stopCellEditing();
    }

    protected void fireEditingStopped() {
        super.fireEditingStopped();
    }
}

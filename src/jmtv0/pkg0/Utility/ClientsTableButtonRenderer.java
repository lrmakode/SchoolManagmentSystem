/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmtv0.pkg0.Utility;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;

public class ClientsTableButtonRenderer extends JButton implements TableCellRenderer {

    public ClientsTableButtonRenderer() {
        setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setForeground(Color.black);
        setBackground(UIManager.getColor("Button.background"));
        setText((value == null) ? "" : value.toString());
        return this;
    }
}

package tablas.modelo;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Gerry
 */
public class HeaderColor extends DefaultTableCellRenderer {

    public HeaderColor() {
        setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);

        setBackground(new java.awt.Color(30, 50, 80));
//you can change the color that u want 
        return this;
    }

}

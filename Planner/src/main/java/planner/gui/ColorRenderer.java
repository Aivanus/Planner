package planner.gui;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;
import planner.domain.Task;

/**
 * Luokka, jolla korvataan JTablen vakio Renderer, jotta soluja voisi värittää.
 */
public class ColorRenderer extends JLabel implements TableCellRenderer {

    /**
     * Konstruktori, joka asettaa Opaque trueksi, jotta värit näkyvät oikein.
     */
    public ColorRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value,
            boolean isSelected, boolean hasFocus,
            int row, int column) {

        Task task = (Task) value;
        Color alternate = UIManager.getColor("Table.alternateRowColor");

        if (value != null) {
            setBackground(task.getColor());
            setText((task.getName()));
        } else {
            setText("");
            if (row % 2 == 1) {
                setBackground(alternate);
            } else {
                setBackground(Color.WHITE);
            }

        }
        if (isSelected) {
            setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.blue));
        } else {
            setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, alternate));
        }
        return this;
    }

}

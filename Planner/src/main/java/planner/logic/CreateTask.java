package planner.logic;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import planner.domain.Day;
import planner.domain.Task;
import planner.domain.Time;

/**
 * Luokka luo uuden "Task"-olion.
 */
public class CreateTask {

    private JTextField nameArea;
    private JTextField timeStartArea;
    private JTextField timeEndArea;
    private JComboBox dayBox;
    private Color color;
    //private JButton createButton;

//    public CreateTask(JTextField nameArea, JTextField timeStartArea, JTextField timeEndArea, JComboBox dayBox) {
//        this.nameArea = nameArea;
//        this.timeStartArea = timeStartArea;
//        this.timeEndArea = timeEndArea;
//        this.dayBox = dayBox;
//        // this.createButton = createButton;
//    }
    /**
     * Konstruktori luo luokan seuraavien.
     *
     * @param nameArea tekstikenttä, johon syötetään tehtävän nimi
     * @param timeStartArea tekstikenttä johon syötetään alkamisaika
     * @param timeEndArea tekstikenttä, johon syötetään loppumisaika
     * @param dayBox combobox, joka sisältää päiviä
     * @param color color-olio
     */
    public CreateTask(JTextField nameArea, JTextField timeStartArea, JTextField timeEndArea, JComboBox dayBox, Color color) {
        this.nameArea = nameArea;
        this.timeStartArea = timeStartArea;
        this.timeEndArea = timeEndArea;
        this.dayBox = dayBox;
        this.color = color;
        // this.createButton = createButton;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Metodi, joka luo uuden "task"-olion, jos oliomuuttujien data on oikein
     * (ei null, liian suuri yms).
     *
     * @return palauttaa uuden task-olion, jos parametrit oikeat, muuten null
     */
    public Task createTask() {

        String name = nameArea.getText();

        if (name.isEmpty()) {
            return null;
        }

        Day day = (Day) dayBox.getSelectedItem();

        if (timeStartArea.getText().isEmpty() || timeEndArea.getText().isEmpty()) {
            return null;
        }
        Time start = new Time(Integer.parseInt(timeStartArea.getText()));
        Time end = new Time(Integer.parseInt(timeEndArea.getText()));

        if (start.getHours() > 23 || start.getHours() < 0
                || end.getHours() > 23 || end.getHours() < 0 || end.getHours() < start.getHours()) {
            return null;
        }
        Task task = new Task(name, start, end, day, color);
        return task;
    }

}

package planner.logic;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import planner.domain.Day;
import planner.domain.Task;
import planner.domain.Time;

public class CreateTask {

    private JTextField nameArea;
    private JTextField timeStartArea;
    private JTextField timeEndArea;
    private JComboBox dayBox;
    private Color color;
    //private JButton createButton;

    public CreateTask(JTextField nameArea, JTextField timeStartArea, JTextField timeEndArea, JComboBox dayBox) {
        this.nameArea = nameArea;
        this.timeStartArea = timeStartArea;
        this.timeEndArea = timeEndArea;
        this.dayBox = dayBox;
        // this.createButton = createButton;
    }

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

    public Task createTask() {

        String name = nameArea.getText();

        if (name.isEmpty()) {
//            JOptionPane.showMessageDialog(new JFrame(),
//                    "Give a name to the task", "Invalid input",
//                    JOptionPane.ERROR_MESSAGE);
            return null;
        }
        Day day = (Day) dayBox.getSelectedItem();

        if (timeStartArea.getText().isEmpty() || timeEndArea.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(new JFrame(),
//                    "Time cannot be empty", "Invalid input",
//                    JOptionPane.ERROR_MESSAGE);
            return null;
        }
        Time start = new Time(Integer.parseInt(timeStartArea.getText()));
        Time end = new Time(Integer.parseInt(timeEndArea.getText()));

        if (start.getHours() > 23 || start.getHours() < 0
                || end.getHours() > 23 || end.getHours() < 0 || end.getHours() < start.getHours()) {
//            JOptionPane.showMessageDialog(new JFrame(),
//                    "Invalid time", "Invalid input",
//                    JOptionPane.ERROR_MESSAGE);
            return null;
        }
        Task task = new Task(name, start, end, day, color);
        System.out.println(task);

        return task;
    }

}

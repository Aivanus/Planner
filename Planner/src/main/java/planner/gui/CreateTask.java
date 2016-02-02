package planner.gui;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import planner.domain.Day;
import planner.domain.Task;
import planner.domain.Time;

public class CreateTask {

    private JTextField nameArea;
    private JTextField timeStartArea;
    private JTextField timeEndArea;
    private JComboBox dayBox;
    //private JButton createButton;

    public CreateTask(JTextField nameArea, JTextField timeStartArea, JTextField timeEndArea, JComboBox dayBox) {
        this.nameArea = nameArea;
        this.timeStartArea = timeStartArea;
        this.timeEndArea = timeEndArea;
        this.dayBox = dayBox;
        // this.createButton = createButton;
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        String name = nameArea.getText();
//        String day = "Monday";
//        Time start = new Time(Integer.parseInt(timeStartArea.getText()));
//        Time end = new Time(Integer.parseInt(timeEndArea.getText()));
//        
//        Task task = new Task(name, start, end, day);
//        System.out.println(task);
//    }
    public void createTask() {

        String name = nameArea.getText();
        String day = (String)dayBox.getSelectedItem();
        Time start = new Time(00);
        Time end = new Time(12);
        
        Task task = new Task(name, start, end, day);
        System.out.println(task);
    }
//    public void createTask() {
//
//        String name = nameArea.getText();
//        String day = "Monday";
//
//        Time start = new Time(Integer.parseInt(timeStartArea.getText()));
//        Time end = new Time(Integer.parseInt(timeEndArea.getText()));
//
//        Task task = new Task(name, start, end, day);
//        System.out.println(task);
//    }

}

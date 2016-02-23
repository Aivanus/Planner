/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planner.logic;

import java.awt.Color;
import planner.logic.TaskFactory;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.tree.DefaultTreeCellEditor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static planner.domain.Day.*;
import static planner.domain.Day.MONDAY;
import planner.domain.Task;

/**
 *
 * @author Ivan
 */
public class TaskFactoryTest {

    private TaskFactory ct;
    private JTextField nameArea;
    private JTextField timeStartArea;
    private JTextField timeEndArea;
    private JComboBox dayBox;
    private Color color;

    public TaskFactoryTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        nameArea = new JTextField("Test");
        timeStartArea = new JTextField("12");
        timeEndArea = new JTextField("13");
        dayBox = new JComboBox(values());
        color = Color.WHITE;
        ct = new TaskFactory(nameArea, timeStartArea, timeEndArea, dayBox, color);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void CorrectInputsCreateTask() {
        Task task = ct.createTask();
        assertEquals("Test, MONDAY, 12:0-13:0", task.toString());
    }

    @Test
    public void IfFieldsAreEmptyReturnNull() {
        nameArea.setText("");
        timeStartArea.setText("");
        timeEndArea.setText("");

        Task task = ct.createTask();
        assertEquals(null, task);
    }

    @Test
    public void IfTimeIsNegativeReturnNull() {
        timeStartArea.setText("-1");
        timeEndArea.setText("-1");
        Task task = ct.createTask();
        assertEquals(null, task);
    }

    @Test
    public void IfTimeIsTooHighReturnNull() {
        timeStartArea.setText("25");
        timeEndArea.setText("25");
        Task task = ct.createTask();
        assertEquals(null, task);
    }

    @Test
    public void IfStartTimeIsHigherThanEndReturnNull() {
        timeStartArea.setText("13");
        timeEndArea.setText("12");
        Task task = ct.createTask();
        assertEquals(null, task);
    }

}
package planner.domain;

import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static planner.domain.Day.*;

public class TaskTest {

    public Task task;

    public TaskTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        task = new Task("test", new Time(12), new Time(13), MONDAY, Color.white);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void taskIsCreatedCorretly() {
        Task t = new Task("test", new Time(12), new Time(13), MONDAY, Color.white);
        assertEquals("test, MONDAY, 12:0-13:0", t.toString());
    }

    @Test
    public void getNameAndGetColorWorks() {
        assertEquals("test", task.getName());
        assertEquals(Color.white, task.getColor());
    }

    @Test
    public void timeAndDayGettersWork() {
        assertEquals(12, task.getStartTime());
        assertEquals(13, task.getEndTime());
        assertEquals(1, task.getDayNumber());
    }

    @Test
    public void getDurationWorks() {
        assertEquals(1, task.getDuration());
    }
}

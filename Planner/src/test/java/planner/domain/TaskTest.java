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
        task = new Task("test", new Time(12), new Time(13), MONDAY, Color.white, "Test123");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void taskIsCreatedCorretly() {
        Task t = new Task("test", new Time(12), new Time(13), MONDAY, Color.white, "Test123");
        assertEquals("test, MONDAY, 12:0-13:0", t.toString());
        assertEquals(Color.white, t.getColor());
        assertEquals("Test123", t.getComment());
    }

    @Test
    public void getNameWorks() {
        assertEquals("test", task.getName());
    }

    @Test
    public void GetColorWorks() {
        assertEquals(Color.white, task.getColor());
    }

    @Test
    public void timeGetterWork() {
        assertEquals(12, task.getStartTime());
        assertEquals(13, task.getEndTime());
    }

    @Test
    public void DayNumberGetterWork() {
        assertEquals(1, task.getDayNumber());
    }

    @Test
    public void getDurationWorks() {
        assertEquals(1, task.getDuration());
    }
    
    @Test
    public void getColorWorks(){
        assertEquals(Color.white, task.getColor());
    }
    
    @Test
    public void getCommentWorks(){
        assertEquals("Test123", task.getComment());
    }
    
    @Test
    public void getDayWorks(){
        assertEquals(MONDAY, task.getDay());
    }
}

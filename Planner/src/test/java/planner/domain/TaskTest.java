package planner.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static planner.domain.Day.*;

public class TaskTest {

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
    }

    @After
    public void tearDown() {
    }

    @Test
    public void taskIsCreatedCorretly() {
        Task t = new Task("test", new Time(12), new Time(13), MONDAY);
        assertEquals("test, MONDAY, 12:0-13:0", t.toString());
    }
}

package planner.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static planner.domain.Day.*;

public class DayTest {

    public DayTest() {
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
    public void correctNumMonday() {
        Day day = MONDAY;
        assertEquals(1, day.getOrdNumber());
    }

    @Test
    public void correctNumTuesday() {
        Day day = TUESDAY;
        assertEquals(2, day.getOrdNumber());
    }

    @Test
    public void correctNumWednesday() {
        Day day = WEDNESDAY;
        assertEquals(3, day.getOrdNumber());
    }

    @Test
    public void correctNumThursday() {
        Day day = THURSDAY;
        assertEquals(4, day.getOrdNumber());
    }

    @Test
    public void correctNumFriday() {
        Day day = FRIDAY;
        assertEquals(5, day.getOrdNumber());
    }

    @Test
    public void correctNumSaturday() {
        Day day = SATURDAY;
        assertEquals(6, day.getOrdNumber());
    }

    @Test
    public void correctNumSunday() {
        Day day = SUNDAY;
        assertEquals(7, day.getOrdNumber());
    }
}

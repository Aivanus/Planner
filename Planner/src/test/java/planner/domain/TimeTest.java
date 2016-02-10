/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planner.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivan
 */
public class TimeTest {

    public TimeTest() {
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
    public void timeInMinutesCorrectWhenZero() {
        Time time = new Time(0, 0);
        assertEquals(0, time.getTimeInMinutes());
    }

    @Test
    public void timeInMinutesCorrect() {
        Time time = new Time(2, 2);
        assertEquals(122, time.getTimeInMinutes());
        time = new Time(24, 0);
        assertEquals(1440, time.getTimeInMinutes());
        time = new Time(23, 59);
        assertEquals(1439, time.getTimeInMinutes());
    }

    @Test
    public void timeIsDisplayedCorrectlyIfNoMinutes() {
        Time time = new Time(12);
        assertEquals("12:0", time.toString());
    }

    @Test
    public void inputIsConvertedToMinutesCorrectly() {
        Time time = new Time(0, 0);
        assertEquals(0, time.getTimeInMinutes());

        time = new Time(2, 0);
        assertEquals(120, time.getTimeInMinutes());

        time = new Time(0, 2);
        assertEquals(2, time.getTimeInMinutes());

        time = new Time(24, 0);
        assertEquals(1440, time.getTimeInMinutes());
    }

}

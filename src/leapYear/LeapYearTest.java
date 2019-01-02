package leapYear;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeapYearTest {

    private LeapYear leapYear;

    @Before
    public void before() {
        this.leapYear = new LeapYear();
    }

    @Test
    public void year2001NoLeapYear(){
        boolean output = leapYear.check(2001);
        assertFalse(output);
    }

    @Test
    public void year1996IsLeapYear() {
        boolean output = leapYear.check(1996);
        assertTrue(output);
    }

    @Test
    public void year1992IsLeapYear() {
        boolean output = leapYear.check(1992);
        assertTrue(output);
    }
}

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
}

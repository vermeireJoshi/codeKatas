package leapYear;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LeapYearTest {

    private int input;
    private boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 2001, false },
                { 1996, true },
                { 1992, true },
                { 1900, false },
                { 1800, false },
                { 2000, true },
                { 1600, true },
        });
    }

    public LeapYearTest(int input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void year2001NoLeapYear(){
        LeapYear leapYear = new LeapYear();
        boolean output = leapYear.check(input);
        assertEquals(expected, output);
    }

}

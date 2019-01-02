package statsCalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StatsCalculatorTest {

    private StatsCalculator stats;

    @Before
    public void before() {
        stats = new StatsCalculator();
    }

    @Test
    public void maxValueReturnsTheMaxValueOfSequenceWithOneElement() {
        int[] sequence = { 3 };

        int max = stats.maxValue(sequence);

        assertEquals(3, max);
    }
}

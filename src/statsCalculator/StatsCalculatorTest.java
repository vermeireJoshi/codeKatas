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

    @Test
    public void maxValueReturnsTheMaxValueOfSequenceWithMultipleElements() {
        int[] sequence = { 1, 2, 3, 4, 5 };

        int max = stats.maxValue(sequence);

        assertEquals(5, max);
    }

    @Test
    public void minValueReturnsTheMinValueOfSequenceWithOneElement() {
        int[] sequence = { 3 };

        int min = stats.minValue(sequence);

        assertEquals(3, min);
    }

    @Test
    public void minValueReturnsTheMinValueOfSequenceWithMultipleElements() {
        int[] sequence = { 1, 2, 3, 4, 5 };

        int min = stats.minValue(sequence);

        assertEquals(1, min);
    }

    @Test
    public void lengthShouldReturnNumberOfElementsSequenceOneElement() {
        int[] sequence = { 5 };

        int length = stats.length(sequence);

        assertEquals(1, length);
    }

    @Test
    public void lengthShouldReturnNumberOfElementsSequenceMultipleElements() {
        int[] sequence = { 1, 2, 3, 4, 5 };

        int length = stats.length(sequence);

        assertEquals(5, length);
    }

    @Test
    public void lengthShouldReturnNumberOfElementsSequenceNoElements() {
        int[] sequence = { };

        int length = stats.length(sequence);

        assertEquals(0, length);
    }

    @Test
    public void averageShouldReturnAverageOfSequenceOneElement() {
        int[] sequence = { 3 };

        int avg = stats.average(sequence);

        assertEquals(3, avg);
    }
}

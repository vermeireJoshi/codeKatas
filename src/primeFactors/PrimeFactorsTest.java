package primeFactors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrimeFactorsTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 2, new int[] { 2 } },
                { 3, new int[] { 3 } },
        });
    }

    private int input;
    private int[] expected;

    public PrimeFactorsTest(int input, int[] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void shouldCalculatePrimeFactors() {
        PrimeFactors primeFactors = new PrimeFactors();

        int[] output = primeFactors.calculate(input);

        assertArrayEquals(expected, output);
    }
}

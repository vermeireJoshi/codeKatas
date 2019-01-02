package fizzBuzz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FizzBuzzTest {

    private int input;
    private String expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, "1" },
                { 2, "2" },
                { 4, "4" },
                { 3, "fizz" },
                { 6, "fizz" },
                { 5, "buzz" },
                { 10, "buzz" },
                { 15, "fizzbuzz"}
        });
    }

    public FizzBuzzTest(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void fizzBuzzShouldReturnString1() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String output = fizzBuzz.fizzBuzz(input);

        assertEquals(expected, output);
    }
}


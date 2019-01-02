package test;

import main.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void before() {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    public void fizzBuzzShouldReturnString1() {
        String output = fizzBuzz.fizzBuzz(1);
        assertEquals("1", output);
    }

    @Test
    public void fizzBuzzShouldReturnString2() {
        String output = fizzBuzz.fizzBuzz(2);
        assertEquals("2", output);
    }
}


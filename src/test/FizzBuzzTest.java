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

    @Test
    public void fizzBuzzShouldReturnString4() {
        String output = fizzBuzz.fizzBuzz(4);
        assertEquals("4", output);
    }

    @Test
    public void fizzBuzzShouldReturnFizzWithInput3() {
        String output = fizzBuzz.fizzBuzz(3);
        assertEquals("fizz", output);
    }

    @Test
    public void fizzBuzzShuoldreturnFizzWithInput6() {
        String output = fizzBuzz.fizzBuzz(6);
        assertEquals("fizz", output);
    }
}


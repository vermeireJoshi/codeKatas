package test;

import main.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void before() {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    public void fizzBuzzShouldReturnString1withInput1() {
        fizzBuzz.fizzBuzz(1);
    }
}


package main;

public class FizzBuzz {

    public String fizzBuzz(int number) {
        if (number % 3 == 0) {
            return "fizz";
        }
        if (number % 5 == 0) {
            return "buzz";
        }
        return Integer.toString(number);
    }

}

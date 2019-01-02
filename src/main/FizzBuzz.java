package main;

public class FizzBuzz {

    public String fizzBuzz(int number) {
        if (number % 3 == 0) {
            return "fizz";
        }
        return Integer.toString(number);
    }

}

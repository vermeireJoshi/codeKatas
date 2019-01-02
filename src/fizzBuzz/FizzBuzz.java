package fizzBuzz;

public class FizzBuzz {

    public String fizzBuzz(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        if (number % 3 == 0) {
            stringBuilder.append("fizz");
        }
        if (number % 5 == 0) {
            stringBuilder.append("buzz");
        }

        if(!stringBuilder.toString().equals("")) {
            return stringBuilder.toString();
        } else {
            return Integer.toString(number);
        }

    }

}

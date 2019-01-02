package primeFactors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeFactors {

    // TODO: add more prime numbers
    private  int[] primeNumbers = { 2, 3, 5 };

    public int[] calculate(int number) {
        if (IntStream.of(primeNumbers).anyMatch(x -> x == number)) {
            return new int[]{ number };
        }

        List<Integer> output = new ArrayList<>();
        for(int i : primeNumbers) {
            if (number % i == 0) {
                output.add(i);
                output.addAll(Arrays.stream(calculate(number / i)).boxed().collect(Collectors.toList()));
                break;
            }
        }
        return output.stream().mapToInt(i -> i).toArray();
    }
}

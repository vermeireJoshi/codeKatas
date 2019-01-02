package statsCalculator;

import java.util.Arrays;

public class StatsCalculator {

    public int maxValue(int[] sequence) {
        return Arrays.stream(sequence).max().getAsInt();
    }

    public int minValue(int[] sequence) {
        return Arrays.stream(sequence).min().getAsInt();
    }

    public int length(int[] sequence) {
        return sequence.length;
    }

    public double average(int[] sequence) {
        return Arrays.stream(sequence).average().getAsDouble();
    }
}

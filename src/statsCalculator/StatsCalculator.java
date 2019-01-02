package statsCalculator;

import java.util.Arrays;

public class StatsCalculator {

    public int maxValue(int[] sequence) {
        return Arrays.stream(sequence).max().getAsInt();
    }
}

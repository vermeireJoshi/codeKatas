package anagrams;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {

    public String[] generate(String input) {
        if (input.length() == 1) {
            return new String[] { input };
        } else  {
            List<String> output = new ArrayList<>();
            String[] characters = input.split("");
            for (int i = 0; i < characters.length; i++ ) {
                String trimmed = input.substring(0, i) + input.substring(i + 1, input.length());
                String[] generated = generate(trimmed);
                for (String gen : generated) {
                    if (!output.contains(characters[i] + gen)) {
                        output.add(characters[i] + gen);
                    }
                }
            }
            return output.toArray(new String[output.size()]);
        }
    }
}

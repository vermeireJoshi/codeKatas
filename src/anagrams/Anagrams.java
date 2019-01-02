package anagrams;

public class Anagrams {

    public String[] generate(String input) {
        if (input.length() == 1) {
            return new String[] { input };
        } else {
            String[] characters = input.split("");
            return new String[] {
                    characters[0] + characters[1],
                    characters[1] + characters[0]
            };
        }
    }
}

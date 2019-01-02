package anagrams;

public class Anagrams {

    public String[] generate(String input) {
        if (input.length() == 1) {
            return new String[] { input };
        } else {
            String[] characters = input.split("");
            if (characters[0].equals(characters[1])) {
                return new String[] { input };
            }
            return new String[] {
                    characters[0] + characters[1],
                    characters[1] + characters[0]
            };
        }
    }
}

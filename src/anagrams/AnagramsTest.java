package anagrams;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class AnagramsTest {

    private String input;
    private String[] expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "a", new String[] { "a" } }
        });
    }

    public AnagramsTest(String input, String[] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void shouldGenerateAllAnagrams() {
        Anagrams anagrams = new Anagrams();

        String[] output = anagrams.generate(input);

        assertArrayEquals(expected, output);
    }
}

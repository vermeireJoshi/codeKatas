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
                { "a", new String[] { "a" } },
                { "b", new String[] { "b" } },
                { "ab", new String[] { "ab", "ba" } },
                { "aa", new String[] { "aa" } },
                { "abc", new String[] { "abc", "acb", "bac", "bca", "cab", "cba" } },
                { "aac", new String[] { "aac", "aca", "caa" } },
                { "aaa", new String[] { "aaa" } },
                { "biro", new String[] { "biro", "bior", "brio", "broi", "boir", "bori",
                        "ibro", "ibor", "irbo", "irob", "iobr", "iorb",
                        "rbio", "rboi", "ribo", "riob", "robi", "roib",
                        "obir", "obri", "oibr", "oirb", "orbi", "orib"} },
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

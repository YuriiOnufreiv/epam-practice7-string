import com.epam.string_task.StringAnalyzer;
import com.epam.string_task.StringAnalyzerImpl;

import org.junit.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortingAnalyzerTest {

    private StringAnalyzer analyzer;

    @Before
    public void runBeforeTestMethod() {
        analyzer = null;
    }

    @Test
    public void testCountLetters() {
        analyzer = new StringAnalyzerImpl("#a1b2c3@,*");
        assertEquals("Wrong count for 'a1b2c3'", 3, analyzer.countLetters());

        // test for non-english letters
        analyzer = new StringAnalyzerImpl("%юєäöüß5");
        assertEquals("Wrong count for non-english letters", 6, analyzer.countLetters());
    }

    @Test
    public void testEqualsIgnoreCase() {
        // test for correct result
        analyzer = new StringAnalyzerImpl("test1-+");
        assertTrue("Wrong result for 'test1-+' and 'teST1-+'", analyzer.equalsIgnoreCase("teST1-+"));

        // test for wrong result
        analyzer = new StringAnalyzerImpl(" TEST+");
        assertFalse("Wrong result for ' TEST+' and 'TEST+'", analyzer.equalsIgnoreCase("TEST+"));

        // test for different languages
        analyzer = new StringAnalyzerImpl("ЕРАМ"); // ukr language
        assertFalse("Wrong result for 'ЕРАМ' in ukr and in engl", analyzer.equalsIgnoreCase("EPAM"));
    }

    @Test
    public void testToUpperCase() {
        // test for correct result
        analyzer = new StringAnalyzerImpl("Some text 123 $");
        assertEquals("Wrong result for 'Some text 123 $'",
                "SOME TEXT 123 $", analyzer.toUpperCase());

        // test for another language
        analyzer = new StringAnalyzerImpl("уКр"); // ukr language
        assertEquals("Wrong result for 'уКр'", "УКР", analyzer.toUpperCase());
    }

    @Test
    public void testToLowerCase() {
        // test for correct result
        analyzer = new StringAnalyzerImpl("SOME text 123 $");
        assertEquals("Wrong result for 'Some text 123 $'",
                "some text 123 $", analyzer.toLowerCase());

        // test for german language
        analyzer = new StringAnalyzerImpl("ÄÖÜẞ");
        assertEquals("Wrong result for 'ÄÖÜẞ'", "äöüß", analyzer.toLowerCase());
    }

    @Test
    public void testGetAllIndicesOfWords() {
        // test for correct result
        analyzer = new StringAnalyzerImpl("dong-ding-dong");
        List<Integer> expected = Arrays.asList(0, 10);
        assertArrayEquals(expected.toArray(), analyzer.getAllIndicesOfWords("dong").toArray());

        // test for different language
        analyzer = new StringAnalyzerImpl("dong-dіng-dong");
        expected = Arrays.asList(5);
        assertArrayEquals(expected.toArray(), analyzer.getAllIndicesOfWords("dіng").toArray());
    }

    @Test
    public void testReplace() {
        // test for correct result
        analyzer = new StringAnalyzerImpl("dong-ding-dong");
        assertEquals("Wrong result for 'dong-ding-dong'", "dang-ding-dang", analyzer.replace("dong", "dang"));
    }

    @Test
    public void testCountWordOccurrences() {
        // test for correct result
        analyzer = new StringAnalyzerImpl("dong-ding-dong");
        assertEquals("Wrong count for 'a1b2c3'", 2, analyzer.countWordOccurrences("dong"));
    }

}

package easy.anagram;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class AnagramTest {

    private static final String MESSAGE = "Input is '%s' and '%s', expected result '%s' but was '%s'";

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"abcd", "dabc", true},
                {"listen", "Silent", true},
                {"Let n1 be the length of first string", "n1 be the length of first string let", true},
                {"triangle", "integrall", false},
                {"abcd", "agcd", false},
                {"ae", "bf", false},
                {"aa", "bb", false},
                {null, null, false}
        });
    }

//    TODO Uncomment it to check your solution
//    private Anagram solution = new AnagramCoding();
    private Anagram solution1 = new AnagramSolution1();
    private Anagram solution2 = new AnagramSolution2();
    private Anagram solution3 = new AnagramSolution3();
    private Anagram solution4 = new AnagramSolution4();

    private String textOne;
    private String textTwo;
    private boolean expectedResult;

    public AnagramTest(String textOne, String textTwo, boolean expectedResult) {
        this.textOne = textOne;
        this.textTwo = textTwo;
        this.expectedResult = expectedResult;
    }

//    TODO Uncomment it to check your solution
//    @Test
//    public void testCodding() {
//        boolean actualResult = solution.isAnagram(textOne, textTwo);
//        Assert.assertEquals(String.format(MESSAGE, textOne, textTwo, expectedResult, actualResult),
//                expectedResult, actualResult);
//    }

    @Test
    public void testSolution1() {
        boolean actualResult = solution1.isAnagram(textOne, textTwo);
        Assert.assertEquals(String.format(MESSAGE, textOne, textTwo, expectedResult, actualResult),
                expectedResult, actualResult);
    }

    @Test
    public void testSolution2() {
        boolean actualResult = solution2.isAnagram(textOne, textTwo);
        Assert.assertEquals(String.format(MESSAGE, textOne, textTwo, expectedResult, actualResult),
                expectedResult, actualResult);
    }

    @Test
    public void testSolution3() {
        boolean actualResult = solution3.isAnagram(textOne, textTwo);
        Assert.assertEquals(String.format(MESSAGE, textOne, textTwo, expectedResult, actualResult),
                expectedResult, actualResult);
    }

    // TODO You can comment it, because {@link AnagramSolution4} is wrong solution.
    @Test
    public void testSolution4() {
        boolean actualResult = solution4.isAnagram(textOne, textTwo);
        Assert.assertEquals(String.format(MESSAGE, textOne, textTwo, expectedResult, actualResult),
                expectedResult, actualResult);
    }
}

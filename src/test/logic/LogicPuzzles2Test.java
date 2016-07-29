package logic;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
/**
 * Created by ashleygrayson on 29/07/2016.
 */
public class LogicPuzzles2Test {

    private LogicPuzzles2 logicPuzzles2;

    @Before
    public void before() {logicPuzzles2 = new LogicPuzzles2();}

    @Test
    public void testAverage() {

        int[] someNumbers = {1, 10, 4};

        double averageNumber = logicPuzzles2.getAverageOfNumbers(someNumbers);

        assertThat(averageNumber, equalTo(5.0));
    }

    @Test
    public void sumDouble_shouldTotalTheArrayTheDoubleValue() {
        int[] someNumbers = {1, 10, 4};

        int sumDoubled = logicPuzzles2.sumDouble(someNumbers);

        assertThat(sumDoubled, equalTo(30));
    }

    @Test
    public void stringIsInString_returnsTrue_ifStringContainsTextToFind() {
        String fullText = "Once upon a time";
        String textToFind = "upon";

        boolean inFullText = logicPuzzles2.stringIsInString(fullText, textToFind);

        assertThat(inFullText, equalTo(true));
    }

}

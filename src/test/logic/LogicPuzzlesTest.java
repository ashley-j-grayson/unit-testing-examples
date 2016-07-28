package logic;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by ashleygrayson on 28/07/2016.
 */
public class LogicPuzzlesTest {

    private LogicPuzzles logicPuzzles;

    @Before
    public void before() {
        LogicPuzzles logicPuzzles = new LogicPuzzles();
    }

    @Test
    public void testLessThan10Logic() {

         boolean b =  logicPuzzles.logicValue(2, 1, 4);

        assertThat(b, equalTo(false));
    }
}

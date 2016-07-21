package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void testAdding1and2() {
        int total = calculator.add(1, 2);

        assertThat(total, equalTo(3));
    }

    @Test
    public void testAdding4and5() {
        int total = calculator.add(4, 5);

        assertThat(total, equalTo(9));
    }

    @Test
    public void testSubtracting12and7() {
        int total = calculator.subtract(12, 7);

        assertThat(total, equalTo(5));
    }

    @Test
    public void testSubtracting20and12() {
        int total = calculator.subtract(20, 12);

        assertThat(total, equalTo(8));
    }

    @Test
    public void testMultiplying2and7() {
        int total = calculator.multiply(2, 7);

        assertThat(total, equalTo(14));
    }

    @Test
    public void testMultiplying7and6() {
        int total = calculator.multiply(7, 6);

        assertThat(total, equalTo(42));
    }

    @Test
    public void testDividing12and6() {
        int total = calculator.divide(12, 6);

        assertThat(total, equalTo(2));
    }

    @Test
    public void testDividing24and6() {
        int total = calculator.divide(24, 6);

        assertThat(total, equalTo(4));
    }

}
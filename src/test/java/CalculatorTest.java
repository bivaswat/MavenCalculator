import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;
    private Object ArithmeticException;

    @Before
    public void initializeCalculator() {
        calculator = new Calculator();
    }
    @Test
    public void testSummeZweiPositiveIsOk() {
        assertEquals(calculator.summe(10, 25), 35);
    }

    @Test
    public void testSubtractionZweiPositiveIsOk() {
        assertEquals(calculator.subtraktion(25, 10), 15);
    }
    @Test
    public void testMultiplicationZweiPositiveIsOk() {
        assertEquals(calculator.multiplication(10, 10), 100);
    }

    @Test
    public void testDivisionZweiPositiveIsOk() {
        assertEquals(calculator.division(4, 2), 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionMitNull() {
        assertEquals(calculator.division(10, 0), 0);
    }

}

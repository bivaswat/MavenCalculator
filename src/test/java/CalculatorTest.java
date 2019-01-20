import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;
    @Test
    public void testSummeZweiPositiveIsOk() {
        calculator = new Calculator();
        assertEquals(calculator.summe(10, 25), 35);
    }

    @Test
    public void testSubtractionZweiPositiveIsOk() {
        calculator = new Calculator();
        assertEquals(calculator.subtraktion(25, 10), 15);
    }
    @Test
    public void testMultiplicationZweiPositiveIsOk() {
        calculator = new Calculator();
        assertEquals(calculator.multiplication(10, 10), 100);
    }

    @Test
    public void testDivisionZweiPositiveIsOk() {
        calculator = new Calculator();
        assertEquals(calculator.division(4, 2), 2);
    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;
    @Test
    public void testSummeZweiPositiveIsOk() {
        calculator = new Calculator();
        assertEquals(calculator.summe(10, 25), 35);
    }
}

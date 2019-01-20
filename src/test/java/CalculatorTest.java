import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;
    /*
        Mit verschiedenen Sichtbarkeitend Testen:
        - protected: Erstelle deine Tests im selben Paket wie die getestete Klasse.
        - package protected: Gleich wie protected.
        - public: Tests können überall erstellt werden. Es muss nichts besonders beachtet werden.
        - private: Normalerweise weisen private Methoden, die Sie testen müssen, darauf hin, dass diese Methoden in andere Klassen verschoben werden sollten, um die Wiederverwendbarkeit zu fördern.
                    Falls erforderlich, können Sie die Zugriffskontrolle mithilfe von Reflection unterdrücken.
         */
    @Before
    public void initializeCalculator() {
        calculator = new Calculator();
    }
    /*
 Addition
  */
    @Test
    public void testAdditionPositives() {
        assertEquals(50, calculator.summe(10, 40));
    }

    @Test
    public void testAdditionNegatives() {
        assertEquals(-50, calculator.summe(-10, -40));
    }

    @Test
    public void testAdditionPositiveNegative() {
        assertEquals(10, calculator.summe(20, -10));
    }

    @Test
    public void testAdditionNegativePositive() {
        assertEquals( -10, calculator.summe(-20, 10));
    }

    @Test
    public void testAdditionZero() {
        assertEquals(9, calculator.summe(0, 9));
    }

    @Test
    public void testAdditionLargeNumbers() {
        assertEquals(107734696, calculator.summe(32915164, 74819532));
    }

    @Test
    public void testAdditionRounding() {
        assertEquals(4, calculator.summe(5 / 2, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowHandlingAddition() {
        assertEquals((long) Integer.MAX_VALUE + 1, calculator.summe(2147483647, 1));
    }

    /*
    Subtraction
     */
    @Test
    public void testSubtractionPositives() {
        assertEquals(10, calculator.subtraktion(20, 10));
    }

    @Test
    public void testSubtractionNegatives() {
        assertEquals(-10, calculator.subtraktion(-20, -10));
    }

    @Test
    public void testSubtractionPositiveNegative() {
        assertEquals(100, calculator.subtraktion(90, -10));
    }

    @Test
    public void testSubtractionNegativePositive() {
        assertEquals(-100, calculator.subtraktion(-90, 10));
    }

    @Test
    public void testSubtractionZero() {
        assertEquals(-30, calculator.subtraktion(0, 30));
    }

    @Test
    public void testSubtractionLargeNumbers() {
        assertEquals(29917805, calculator.subtraktion(64182956, 34265151));
    }

    @Test
    public void testSubtractionRounding() {
        assertEquals(9, calculator.subtraktion(21 / 2, 1));
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowHandlingSubtraction() {
        assertEquals((long) Integer.MIN_VALUE - 1, calculator.subtraktion(-2147483648, 1));
    }

    /*
    Division
     */
    @Test
    public void testDivisionPositives() {
        assertEquals(2, calculator.division(40, 20), 0);
    }

    @Test
    public void testDivisionNegatives() {
        assertEquals(2, calculator.division(-40, -20), 0);
    }

    @Test
    public void testDivisionPositiveNegative() {
        assertEquals(-10, calculator.division(100, -10), 0);
    }

    @Test
    public void testDivisionNegativePositive() {
        assertEquals(-10, calculator.division(-100, 10), 0);
    }

    @Test(expected = AssertionError.class)
    public void testDivisionByZero() {
        assertEquals(0, calculator.division(10, 0), 0);
    }

    @Test
    public void testDivisionByZeroNotRaised() throws StackOverflowError {
        assertEquals(10, calculator.division(10, 1), 0);
    }

    @Test
    public void testDivisionPointNumbers() {
        assertEquals(1.5, calculator.division(3, 2), 1);
    }

    @Test
    public void testDivisionMorePointNumbers() {
        assertEquals(3.333, calculator.division(10, 3), 3);
    }

    /*
    Multiplication
     */
    @Test
    public void testMultiplicationPositives() {
        assertEquals(100, calculator.multiplication(10, 10));
    }

    @Test
    public void testMultiplicationNegatives() {
        assertEquals(100, calculator.multiplication(-10, -10));
    }

    @Test
    public void testMultiplicationPositiveNegative() {
        assertEquals(-120, calculator.multiplication(20, -6));
    }

    @Test
    public void testMultiplicationNegativePositive() {
        assertEquals(-120, calculator.multiplication(-20, 6));
    }

    @Test
    public void testMultiplicationWithZero() {
        assertEquals(0, calculator.multiplication(1000, 0));
    }

    @Test
    public void testMultiplicationLargeNumbers() {
        assertEquals(447084, calculator.multiplication(33, 13548));
    }

    @Test
    public void testMultiplicationRounding() {
        assertEquals(6, calculator.multiplication(5 / 2, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowHandlingMultiplication() {
        assertEquals((long) Integer.MAX_VALUE * 2, calculator.multiplication(2147483647, 2));
    }



}

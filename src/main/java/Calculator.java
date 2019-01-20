class Calculator {

    int summe(int value1, int value2) {
        long tester = (long) value1 + (long) value2;
        overflowhandler(tester);
        return (int) tester;
    }

    private void overflowhandler(long tester) {
        if (tester > Integer.MAX_VALUE) {
            throw new ArithmeticException("Result is too big");
        }
        if (tester < Integer.MIN_VALUE) {
            throw new ArithmeticException("Result is too small");
        }
    }

    int subtraktion(int value1, int value2) {
        return value1 - value2;
    }

    int multiplication(int value1, int value2) {
        return value1 * value2;
    }

    int division(int value1, int value2) {
        return value1 / value2;

    }
}

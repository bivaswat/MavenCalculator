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
        if (value2 != 0) {
            long tester = (long) value1 - (long) value2;
            overflowhandler(tester);
            return (int) tester;
        }
        else throw new ArithmeticException("Division by Zero");
    }

    int multiplication(int value1, int value2) {
        long tester = (long) value1 * (long) value2;
        overflowhandler(tester);
        return (int) tester;
    }

    int division(int value1, int value2) {
        long tester = (long) value1 / (long) value2;
        overflowhandler(tester);
        return (int) tester;
    }
}

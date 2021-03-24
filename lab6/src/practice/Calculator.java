package practice;

import practice.exceptions.DivisionByZeroException;
import practice.exceptions.NullElementException;
import practice.exceptions.OverflowException;

public class Calculator {

    public static Double add(Double a, Double b) throws NullElementException, OverflowException {
        validateForNulls(a, b);
        if (Double.MAX_VALUE - a < b) {
            throw new OverflowException("A + B exceed double max value");
        }

        //TODO: overflow

        return a + b;
    }

    public static Double substract(Double a, Double b) throws NullElementException {
        validateForNulls(a, b);

        //TODO: overflow & underflow
        return a - b;
    }

    public static Double multiply(Double a, Double b) throws NullElementException {
        validateForNulls(a, b);

        //TODO: overflow & underflow
        return a * b;
    }

    public static Double divide(Double a, Double b) throws NullElementException, DivisionByZeroException {
        validateForNulls(a, b);

        if (b == 0) {
            throw new DivisionByZeroException("B cannot be zero");
        }

        return a / b;
    }


    private static void validateForNulls(Double a, Double b) throws NullElementException {
        if (a == null || b == null) {
            throw new NullElementException("A and b cannot be null");
        }
    }
}

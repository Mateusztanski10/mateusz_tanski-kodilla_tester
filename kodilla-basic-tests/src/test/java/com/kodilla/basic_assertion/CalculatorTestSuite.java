package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator2 = new Calculator();
        int c = 10;
        int d = 5;
        int subtractResult = calculator2.subtract(c, d);
        assertEquals(5, subtractResult);
    }

    @Test
    public void testSquareUp() {
        Calculator calculator3 = new Calculator();
        int e = 8;
        int squareUpResult = calculator3.squareUp(e);
        assertEquals(64, squareUpResult, 0.1);
    }
}

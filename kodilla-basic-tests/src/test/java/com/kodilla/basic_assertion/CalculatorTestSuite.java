package com.kodilla.basic_assertion;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    static int a, b, c, d;
    static double e, f;
    static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        calculator = new Calculator();
        a = 5;
        b = 8;
        c = 10;
        d = 5;
        e = 2;
        f = 3;
    }

    @Test
    public void testSum() {
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        int subtractResult = calculator.subtract(c, d);
        assertEquals(5, subtractResult);
    }

    @Test
    public void testSquareUp() {
        double squareUpResult = calculator.squareUp(e, f);
        assertEquals(8, squareUpResult, 0.1);
    }
}

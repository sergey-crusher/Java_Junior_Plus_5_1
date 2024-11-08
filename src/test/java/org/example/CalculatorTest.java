package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class CalculatorTest {
    Calculator calculator;

    @Before
    public void begin() {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        double expected = 15;
        double result = calculator.add(10, 5);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void addStringFormat() {
        double expected = 15;
        double result = calculator.add("10", "5");
        assertEquals(expected, result, 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void addStringWithNumberFormatException() {
        calculator.add("abc", "5");
    }

    @Test
    public void subtraction() {
        double expected = 5;
        double result = calculator.subtraction(10, 5);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void multiplication() {
        double expected = 50;
        double result = calculator.multiplication(10, 5);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void division() {
        double expected = 2;
        double result = calculator.division(10, 5);
        assertEquals(expected, result, 0.0001);
    }

    @After
    public void end() {
        calculator = null;
    }
}
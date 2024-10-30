package org.example;

import org.junit.Test;

import static org.junit.Assert.*;
public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void add() {
        double expected = 15;
        double result = calculator.add(10, 5);
        assertEquals(expected, result, 0.0001);
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
}
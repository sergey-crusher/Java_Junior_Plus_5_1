package org.example;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double add(String a, String b){
        double lA = Double.parseDouble(a);
        double lB = Double.parseDouble(b);

        return lA + lB;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }
}

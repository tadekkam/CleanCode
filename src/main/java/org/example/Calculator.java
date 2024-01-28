package org.example;

public class Calculator {
    public static double add(double number1, double number2) {
        return number1 + number2;
    }
    public static double sub(double number1, double number2) {
        return number1 - number2;
    }
    public static double mul(double number1, double number2) {
        return number1 * number2;
    }
    public static double div(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        return number1 / number2;
    }

}


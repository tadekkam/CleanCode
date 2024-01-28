package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @Test
    void add() {
        Assertions.assertEquals(10, Calculator.add(5,5));
    }

    @Test
    void sub() {
        Assertions.assertEquals(5, Calculator.sub(10,5));
    }

    @Test
    void mul() {
        Assertions.assertEquals(25, Calculator.mul(5,5));
    }

    @Test
    void div() {
        Assertions.assertEquals(2, Calculator.div(10,5));
    }

    @Test
    void divError() {
        Assertions.assertThrows(ArithmeticException.class, () -> Calculator.div(5,0));
    }

}
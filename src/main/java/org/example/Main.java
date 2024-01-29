package org.example;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (Modulo.mod(i,3) && Modulo.mod(i,5)) {
                System.out.println("FizzBuzz");
            } else if (Modulo.mod(i,3)) {
                System.out.println("Fizz");
            } else if (Modulo.mod(i,5)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
package org.example;
public class Modulo {
    public static boolean mod(int argA, int argB) {
        if (argA % argB == 0) {
            return true;
        }
        return false;
    }
    public static void fizzBuzz(int argA) {
        if (mod(argA,3) && Modulo.mod(argA,5)) {
            System.out.println("FizzBuzz");
        } else if (mod(argA,3)) {
            System.out.println("Fizz");
        } else if (mod(argA,5)) {
            System.out.println("Buzz");
        } else {
            System.out.println(argA);
        }
    }

}

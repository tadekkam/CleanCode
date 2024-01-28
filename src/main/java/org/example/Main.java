package org.example;

import static org.example.Palindrome.*;

public class Main {
    public static void main(String[] args) {

        String text = "qqbccvqvccbqq";

        if (isPalindrome(text)) {
            System.out.println(text.length());
        }
    }
}
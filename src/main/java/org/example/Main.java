package org.example;

import static org.example.Palindrome.*;

public class Main {
    public static void main(String[] args) {

        String text = "qqbccvqvccbqq";

        text = text.trim();
        if (text.length() > 0) {
            if (isPalindrome(text)) {
                System.out.println("This text is a palindrome");
            }
            System.out.println(text.length());
        }
    }
}
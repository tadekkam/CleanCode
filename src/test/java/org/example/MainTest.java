package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Palindrome.isPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void palindrome() {
        String text = "qqbccvqvccbqq";
        Assertions.assertTrue(isPalindrome(text));
    }

    @Test
    void palindromeError() {
        String text = "nie";
        Assertions.assertFalse(isPalindrome(text));
    }

}
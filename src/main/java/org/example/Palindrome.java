package org.example;

public class Palindrome {

    public static boolean isPalindrome(String palindrome) {
        if (palindrome.length() > 0) {
            for (int i = 0, j = palindrome.length() - 1; i < j; i++, j--) {
                if (Character.toLowerCase(palindrome.charAt(i)) != Character.toLowerCase(palindrome.charAt(j)))
                    return false;
            }
        }
        return true;
    }
}

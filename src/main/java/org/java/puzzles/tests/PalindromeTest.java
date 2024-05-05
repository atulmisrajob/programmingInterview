package org.java.puzzles.tests;

import org.java.puzzles.code.Palindrome;

public class PalindromeTest {
    public static void checkOutput() {
        int[] inputParam1 = {121, 223, 333, 987};
        boolean[] result = {true, false, true, false};
        Palindrome palindrome = new Palindrome();

        for (int i = 0; i < inputParam1.length; i++) {
            if (result[i] == palindrome.checkPalindrome(inputParam1[i])) {
                System.out.println("OUTPUT for " + inputParam1[i] + " : " + result[i] + " --> PASS");
            } else {
                System.out.println("OUTPUT for " + inputParam1[i] + " : " + result[i] + " --> FAIL");
            }
        }

    }
}

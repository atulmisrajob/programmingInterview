package org.java.puzzles.tests;

import org.java.puzzles.code.StringPalindrome;

public class StringPalindromeTest {
    public static void checkOutput() {
        String[] inputParam1 = {"name", "dad", "java", "civic"};
        boolean[] result = {false, true, false, true};
        StringPalindrome stringPalindrome = new StringPalindrome();

        for (int i = 0; i < inputParam1.length; i++) {
            if (result[i] == stringPalindrome.checkPalindrome(inputParam1[i])) {
                System.out.println("OUTPUT for " + inputParam1[i] + " : " + result[i] + " --> PASS");
            } else {
                System.out.println("OUTPUT for " + inputParam1[i] + " : " + result[i] + " --> FAIL");
            }
        }

    }
}

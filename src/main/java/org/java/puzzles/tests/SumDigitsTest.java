package org.java.puzzles.tests;

import org.java.puzzles.code.SumDigits;

public class SumDigitsTest {
    public static void checkOutput() {
        int[] inputParam1 = {121, 149, 10, 2, 0, 770, 1010, 55};
        int[] result = {4, 14, 1, 2, 0, 14, 2, 10};
        SumDigits sumDigits = new SumDigits();

        for (int i = 0; i < inputParam1.length; i++) {
            if (result[i] == sumDigits.sumDigits(inputParam1[i])) {
                System.out.println("OUTPUT for " + inputParam1[i] + " : " + result[i] + " --> PASS");
            } else {
                System.out.println("OUTPUT for " + inputParam1[i] + " : " + result[i] + " --> FAIL");
            }
        }

    }
}

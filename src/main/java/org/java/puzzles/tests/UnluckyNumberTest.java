package org.java.puzzles.tests;

import org.java.puzzles.code.UnluckyNumber;

public class UnluckyNumberTest {
    public static void checkOutput() {
        int[] inputParam1 = {1, 1, 2, 20};
        int[] inputParam2 = {2, 2, 20, 2};
        int[] inputParam3 = {3, 20, 3, 3};
        int[] result = {6, 3, 2, 0};
        UnluckyNumber unluckyNumber = new UnluckyNumber();

        for (int i = 0; i < inputParam1.length; i++) {
            if (result[i] == unluckyNumber.unluckyNumbers(inputParam1[i], inputParam2[i], inputParam3[i])) {
                System.out.println("OUTPUT for " + inputParam1[i] + ", " + inputParam2[i] + ", " + inputParam3[i] + " : " + result[i] + " --> PASS");
            } else {
                System.out.println("OUTPUT for " + inputParam1[i] + ", " + inputParam2[i] + ", " + inputParam3[i] + " : " + result[i] + " --> FAIL");
            }
        }

    }
}

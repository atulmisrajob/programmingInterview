package org.java.puzzles.tests;

import org.java.puzzles.code.FarthestNumber;

public class ReturnFarthestTest {
    public static void checkOutput() {
        int[] inputParam1 = {12, 22, 33, 1};
        int[] inputParam2 = {9, 23, 100, 0};
        int[] result = {9, 23, 100, 0};
        FarthestNumber farthestNumber = new FarthestNumber();

        for (int i = 0; i < inputParam1.length; i++) {
            if (result[i] == farthestNumber.returnFarthest(inputParam1[i], inputParam2[i])) {
                System.out.println("OUTPUT for " + inputParam1[i] + ", " + inputParam2[i] + " : " + result[i] + " --> PASS");
            } else {
                System.out.println("OUTPUT for " + inputParam1[i] + ", " + inputParam2[i] + " --> FAIL");
            }
        }

    }
}

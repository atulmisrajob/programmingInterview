package org.java.puzzles.tests;

import org.java.puzzles.code.EvenlySpaced;

public class EvenlySpacedTest {
    public static void checkOutput() {
        int[] inputParam1 = {2, 4, 2, 9, 3};
        int[] inputParam2 = {2, 2, 4, 10, 3};
        int[] inputParam3 = {3, 6, 4, 11, 3};
        boolean[] result = {false, true, false, true, true};
        EvenlySpaced evenlySpaced = new EvenlySpaced();

        for (int i = 0; i < inputParam1.length; i++) {
            if (result[i] == evenlySpaced.checkForEvenlySpaced(inputParam1[i], inputParam2[i], inputParam3[i])) {
                System.out.println("OUTPUT for " + inputParam1[i] + ", " + inputParam2[i] + ", " + inputParam3[i] + " : " + result[i] + " --> PASS");
            } else {
                System.out.println("OUTPUT for " + inputParam1[i] + ", " + inputParam2[i] + ", " + inputParam3[i] + " : " + result[i] + " --> FAIL");
            }
        }

    }
}

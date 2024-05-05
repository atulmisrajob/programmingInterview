package org.java.puzzles.tests;

import org.java.puzzles.code.DuplicateArray;

import java.util.Arrays;

public class DuplicateArrayTest {
    public static void checkOutput() {
        int[] a = new int[]{1, 3, 2, 3, 4, 5};
        int[] b = new int[]{0, 3, 1, 2};
        int[] c = new int[]{1, 2, 2, 10, 40, 10};
        int[] d = new int[]{1, 2, 3, 4, 5, 6};
        int[][] inputParam1 = {a, b, c, d};
        int[] res1 = new int[]{3};
        int[] res3 = new int[]{2, 10};
        int[][] result = {res1, null, res3, null};
        DuplicateArray duplicateArray = new DuplicateArray();

        for (int i = 0; i < inputParam1.length; i++) {
            if (Arrays.equals(result[i], duplicateArray.findDuplicates(inputParam1[i]))) {
                System.out.println("OUTPUT for " + Arrays.toString(inputParam1[i]) + " : " + Arrays.toString(result[i]) + " --> PASS");
            } else {
                System.out.println("OUTPUT for " + Arrays.toString(inputParam1[i]) + " : " + Arrays.toString(result[i]) + " --> FAIL");
            }
        }

    }
}

package org.java.puzzles.tests;

import org.java.puzzles.code.KthSmallestArray;

import java.util.Arrays;

public class KthSmallestTest {
    public static void checkOutput() {
        int[] a = new int[]{1, 3, 2, 3, 4, 5};
        int[] b = new int[]{0, 3, 1, 2};
        int[] c = new int[]{1, 2, 2, 10, 40, 10};
        int[] d = new int[]{1, 2, 3, 4, 5, 6};
        int[][] inputParam1 = {a, b, c, d};
        int[] inputParam2 = {3, 2, 1, 4};
        int[] result = {3, 1, 1, 4};
        KthSmallestArray kthSmallestArray = new KthSmallestArray();

        for (int i = 0; i < inputParam1.length; i++) {
            if (result[i] == kthSmallestArray.findKthSmallest(inputParam2[i], inputParam1[i])) {
                System.out.println("OUTPUT for " + Arrays.toString(inputParam1[i]) + ", " + inputParam2[i] + " : " + result[i] + " --> PASS");
            } else {
                System.out.println("OUTPUT for " + Arrays.toString(inputParam1[i]) + ", " + inputParam2[i] + " : " + result[i] + " --> FAIL");
            }
        }

    }
}

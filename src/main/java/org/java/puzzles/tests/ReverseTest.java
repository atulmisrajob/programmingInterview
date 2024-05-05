package org.java.puzzles.tests;

import org.java.puzzles.code.Reverse;

public class ReverseTest {
    public static void checkOutput() {
        int[] inputParam1 = {121, 223, 333, 987};
        int[] result = {121, 322, 333, 789};
        Reverse reverse = new Reverse();

        for (int i = 0; i < inputParam1.length; i++) {
            if (result[i] == reverse.returnReverse(inputParam1[i])) {
                System.out.println("OUTPUT for " + inputParam1[i] + " : " + result[i] + " --> PASS");
            } else {
                System.out.println("OUTPUT for " + inputParam1[i] + " : " + result[i] + " --> FAIL");
            }
        }

    }
}

package org.java.puzzles.tests;

import org.java.puzzles.code.FindBob;

public class FindBobTest {
    public static void checkOutput() {
        String[] inputParam1 = {"bac", "b9b", "abcbob", "b12b1b", "123abcbcdbabxyz", "abcdefb", "bbb"};
        boolean[] result = {false, true, true, true, true, false, true};
        FindBob findBob = new FindBob();

        for (int i = 0; i < inputParam1.length; i++) {
            if (result[i] == findBob.findBob(inputParam1[i])) {
                System.out.println("OUTPUT for " + inputParam1[i] + " : " + result[i] + " --> PASS");
            } else {
                System.out.println("OUTPUT for " + inputParam1[i] + " : " + result[i] + " --> FAIL");
            }
        }

    }
}

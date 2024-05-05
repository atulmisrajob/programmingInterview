package org.java.puzzles.tests;

import org.java.puzzles.code.MixingStrings;

public class MixingStringsTest {
    public static void checkOutput() {
        String[] inputParam1 = {"abc", "Hi", "xxxx", "xxx", "2/", "ax", "a", "So"};
        String[] inputParam2 = {"xyz", "There", "There", "X", "27 around", "b", "bx", "Long"};
        String[] result = {"axbycz", "HTihere", "xTxhxexre", "xXxx", "22/7 around", "abx", "abx", "SLoong"};
        MixingStrings mixingStrings = new MixingStrings();

        for (int i = 0; i < inputParam1.length; i++) {
            if (result[i].equals(mixingStrings.doMixing(inputParam1[i], inputParam2[i]))) {
                System.out.println("OUTPUT for " + inputParam1[i] + ", " + inputParam2[i] + " : " + result[i] + " --> PASS");
            } else {
                System.out.println("OUTPUT for " + inputParam1[i] + ", " + inputParam2[i] + " : " + result[i] + " --> FAIL");
            }
        }

    }
}

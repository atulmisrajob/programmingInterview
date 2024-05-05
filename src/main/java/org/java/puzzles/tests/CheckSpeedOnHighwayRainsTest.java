package org.java.puzzles.tests;

import org.java.puzzles.code.CheckSpeedOnHighwayRains;

public class CheckSpeedOnHighwayRainsTest {
    public static void checkOutput() {
        int[] inputParam1 = {50, 100, 100, 95, 59, 59, 90, 90, 60, 50, 70, 95, 105};
        boolean[] inputParam2 = {false, false, true, true, false, false, true, true, true, false, true, false, false};
        boolean[] result = {false, false, true, true, false, false, true, true, true, false, true, false, false};
        CheckSpeedOnHighwayRains checkSpeedOnHighwayRains = new CheckSpeedOnHighwayRains();

        for (int i = 0; i < inputParam1.length; i++) {
            if (result[i] == checkSpeedOnHighwayRains.checkSpeed(inputParam1[i], inputParam2[i])) {
                System.out.println("OUTPUT for " + inputParam1[i] + ", " + inputParam2[i] + " : " + result[i] + " --> PASS");
            } else {
                System.out.println("OUTPUT for " + inputParam1[i] + ", " + inputParam2[i] + " : " + result[i] + " --> FAIL");
            }
        }

    }
}

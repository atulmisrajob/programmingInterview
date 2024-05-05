package org.java.puzzles.tests;


import org.java.puzzles.code.CheckSpeedOnHighway;

public class CheckSpeedOnHighwayTest {
    public static void checkOutput() {
        int[] inputParam1 = {30, 50, 70, 30, 50, 60, 61, 40, 39, 40, 39};
        boolean[] inputParam2 = {false, true, true, false, true, true, false, true, false, true, false};
        boolean[] result = {false, true, true, false, true, true, false, true, false, true, false};
        CheckSpeedOnHighway checkSpeedOnHighway = new CheckSpeedOnHighway();

        for (int i = 0; i < inputParam1.length; i++) {
            if (result[i] == checkSpeedOnHighway.checkSpeed(inputParam1[i], inputParam2[i])) {
                System.out.println("OUTPUT for " + inputParam1[i] + ", " + inputParam2[i] + " : " + result[i] + " --> PASS");
            } else {
                System.out.println("OUTPUT for " + inputParam1[i] + ", " + inputParam2[i] + " : " + result[i] + " --> FAIL");
            }
        }

    }
}

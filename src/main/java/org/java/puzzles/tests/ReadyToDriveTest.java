package org.java.puzzles.tests;

import org.java.puzzles.code.ReadyToDrive;

public class ReadyToDriveTest {
    public static void checkOutput() {
        boolean[] inputParam1 = {false, true, false, true};
        boolean[] inputParam2 = {false, false, true, true};
        boolean[] result = {true, false, true, true};
        ReadyToDrive readyToDrive = new ReadyToDrive();

        for (int i = 0; i < inputParam1.length; i++) {
            if (result[i] == readyToDrive.readyToDrive(inputParam1[i], inputParam2[i])) {
                System.out.println("OUTPUT for " + inputParam1[i] + ", " + inputParam2[i] + " : " + result[i] + " --> PASS");
            } else {
                System.out.println("OUTPUT for " + inputParam1[i] + ", " + inputParam2[i] + " --> FAIL");
            }
        }

    }
}

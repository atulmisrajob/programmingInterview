package org.java.puzzles.tests;

import org.java.puzzles.code.Spaceship;

public class SpaceshipTest {
    public static void checkOutput() {
        boolean[] inputParam1 = {false, true, false, true};
        boolean[] inputParam2 = {false, false, true, true};
        boolean[] result = {true, false, false, true};
        Spaceship spaceship = new Spaceship();

        for (int i = 0; i < inputParam1.length; i++) {
            if (result[i] == spaceship.checkSpaceshipProblem(inputParam1[i], inputParam2[i])) {
                System.out.println("OUTPUT for " + inputParam1[i] + ", " + inputParam2[i] + " : " + result[i] + " --> PASS");
            } else {
                System.out.println("OUTPUT for " + inputParam1[i] + ", " + inputParam2[i] + " --> FAIL");
            }
        }

    }
}

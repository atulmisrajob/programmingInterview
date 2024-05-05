package org.java.puzzles.code;


import org.java.puzzles.tests.SpaceshipTest;

public class Spaceship {

    /**
     * We need to write code to check if there is any issue with our spaceship. Our spaceship has 2 indicators → red and yellow. The Spaceship is having a problem if both the indicators blink or none of the indicators blink, if one blinks there is no problem in spaceship. Write a method which tells us if the spaceship is having any problem. Return true if there is any problem and false if there is no problem
     * <p>
     * Need to test it against following input :
     * checkSpaceshipProblem(true, true) → true
     * checkSpaceshipProblem(true, false) → false
     * checkSpaceshipProblem(false, true) → false
     * checkSpaceshipProblem(false, false) → true
     */

    public boolean checkSpaceshipProblem(boolean redIndicator, boolean yellowIndicator) {
        /* Start writing your code here */

        return false;
    }

    public static void main(String[] args) {
        SpaceshipTest.checkOutput();
    }
}

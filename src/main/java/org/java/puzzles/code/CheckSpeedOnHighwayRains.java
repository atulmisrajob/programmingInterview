package org.java.puzzles.code;


import org.java.puzzles.tests.CheckSpeedOnHighwayRainsTest;

public class CheckSpeedOnHighwayRains {

    /**
     * We have to make sure we drive at the right speed on and off highways. When you are driving on highways you have to make sure you drive between 60 and 90 (inclusive). Unless it's not raining, then the upper limit is 100 instead of 90. Return true if you are driving at the right speed.
     * <p>
     * checkSpeed(50, false) → false
     * checkSpeed(100, false) → false
     * checkSpeed(100, true) → true
     * checkSpeed(95, true) → true
     * checkSpeed(59, true) → false
     * checkSpeed(59, false) → false
     * checkSpeed(90, false) → true
     * checkSpeed(90, true) → true
     * checkSpeed(60, false) → true
     * checkSpeed(50, true) → false
     * checkSpeed(70, false) → true
     * checkSpeed(95, false) → false
     * checkSpeed(105, true) → false
     */

    public boolean checkSpeed(int speed, boolean isRaining) {
        /* Start writing your code here */

        return false;
    }

    public static void main(String[] args) {
        CheckSpeedOnHighwayRainsTest.checkOutput();
    }
}

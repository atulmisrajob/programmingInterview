package org.java.puzzles.code;


import org.java.puzzles.tests.EvenlySpacedTest;

import static java.lang.Math.abs;

public class EvenlySpaced {

    /**
     * Let’s say you are given 3 integers as an input → a, b, c. Return true if all 3 numbers are evenly spaced.
     * <p>
     * evenlySpaced(1, 2, 3) → false
     * evenlySpaced(1, 2, 3) → true
     * evenlySpaced(1, 2, 30) → false
     * evenlySpaced(5, 10, 15) → true
     * evenlySpaced(2, 4, 4) → false
     * evenlySpaced(2, 4, 4) → false
     * evenlySpaced(3, 3, 3) → true
     */

    public boolean checkForEvenlySpaced(int a, int b, int c) {
        /* Start writing your code here */
        return abs(a - b) == abs(b - c) && abs(a - b) == abs(a - c) &&  abs(a - c) == abs(b - c);
    }

    public static void main(String[] args) {
        EvenlySpacedTest.checkOutput();
    }
}

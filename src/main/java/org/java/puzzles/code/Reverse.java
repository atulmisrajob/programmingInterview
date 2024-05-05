package org.java.puzzles.code;

import org.java.puzzles.tests.ReverseTest;

public class Reverse {

    /**
     * You are given an integer as an input. Write a program to return the reverse of a number.
     * <p>
     * returnReverse(23) → 32
     * returnReverse(45) → 54
     */

    public int returnReverse(int n) {
        /* Start writing your code here */
        int reverse = 0;
        while (n != 0) {
            int reminder = n % 10;
            reverse = reverse * 10 + reminder;
            n = n / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        ReverseTest.checkOutput();
    }
}

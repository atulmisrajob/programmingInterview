package org.java.puzzles.code;


import org.java.puzzles.tests.UnluckyNumberTest;

public class UnluckyNumber {

    /**
     * Let’s say you are given 3 integer values → a b c and you have to return their sum. However there’s a trick, 20 is considered to be an unlucky number as per numerology. Out of all the values that are given as input, if one of the values is 20 then it does not count towards the sum and values to its right do not count. So for example, if b is 20, then both b and c do not count.
     * <p>
     * unluckyNumbers(1, 2, 3) → 6
     * unluckyNumbers(1, 2, 20) → 3
     * unluckyNumbers(2, 20, 3) → 2
     * unluckyNumbers(20, 2, 3) → 0
     */

    public int unluckyNumbers(int a, int b, int c) {
        /* Start writing your code here */

        return 0;
    }

    public static void main(String[] args) {
        UnluckyNumberTest.checkOutput();
    }
}

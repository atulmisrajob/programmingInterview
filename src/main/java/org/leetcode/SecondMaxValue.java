package org.leetcode;

public class SecondMaxValue {

    public static void main(String[] args) {
        int[] nums = {13, 34, 2, 34, 33, 1};
        int pos = findSecondMax(nums);
        System.out.print(pos + "\n ");


    }

    private static int findSecondMax(int[] nums) {
        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MIN_VALUE;
        for (int num : nums) {
            if (MAX < num) {
                MIN = MAX;
                MAX = num;
            } else if (MIN < num && MAX != num) {
                MIN = num;
            }
        }
        return MIN;
    }
}

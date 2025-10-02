package org.leetcode;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int pos = removeElementBruteForce(nums, 0);
        System.out.print(pos + "\n ");

        int[] nums1 = {0, 1, 0, 3, 12};
        int pos1 = removeElementTwoPointer(nums1, 0);
        System.out.print(pos1 + "\n ");

    }

    private static int removeElementTwoPointer(int[] nums1, int i) {

        return 0;
    }

    private static int removeElementBruteForce(int[] nums, int i) {
        int n = nums.length;
        int[] result = new int[n];
        int j = 0;
        int index = 0;
        for (int m : nums) {
            if (m != i) {
                result[j] = m;
                j++;
            }
        }
        for (int k = 0; k < result.length; k++) {
            if (result[k] == i) {
                index = k;
            }
        }
        return index;

    }
}

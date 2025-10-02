package org.leetcode;

public class MoveZero {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroesBruteForce(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.print("\n");

        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroesTwoPointer(nums1);
        for (int num1 : nums1) {
            System.out.print(num1 + " ");
        }
        System.out.print("\n");

        int[] nums2 = {0, 1, 0, 3, 12};
        moveZeroesOptimalWay(nums2);
        for (int num2 : nums2) {
            System.out.print(num2 + " ");
        }
    }

    private static void moveZeroesOptimalWay(int[] nums1) {
        int lastzeronumber=0;
        for(int current=0;current<nums1.length;current++){
            if (nums1[current]!=0) {
                int temp = nums1[lastzeronumber];
                nums1[lastzeronumber]=nums1[current];
                nums1[current]=temp;
                lastzeronumber++;
            }

        }
    }

    private static void moveZeroesTwoPointer(int[] nums1) {
        int nonZeroIndex=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=0){
                nums1[nonZeroIndex]=nums1[i];
                nonZeroIndex++;
            }
        }
        while(nonZeroIndex<nums1.length){
            nums1[nonZeroIndex]=0;
            nonZeroIndex++;
        }

    }

    private static void moveZeroesBruteForce(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int j = 0;
        for (int i : nums) {
            if (i != 0) {
                result[j] = i;
                j++;
            }
        }

        for (; j < n; j++) {
            result[j] = 0;
        }
        System.arraycopy(result, 0, nums, 0, n);

    }
}

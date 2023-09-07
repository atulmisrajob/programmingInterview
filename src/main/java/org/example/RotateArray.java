package org.example;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 8, 9, 34, 2};
        int rotate = 3;
        rotateArray(arr, rotate);
    }

    private static void rotateArray(int[] arr, int rotate) {
        for (int i = 0; i < rotate; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        System.out.printf(Arrays.toString(arr));
    }
}

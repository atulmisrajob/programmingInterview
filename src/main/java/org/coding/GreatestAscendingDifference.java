package org.coding;

public class GreatestAscendingDifference {

    public static void main(String[] args) {
        int[] a = {4,2,5,8,1};//{8, 7, 6, 5, 4}
        int min = a[0];
        int max = a[0];
        int current = 1;
        int index = 0;


        // find the lowest element in left side
        for (int i = 0; i < a.length; i++) {
            current = a[i];

            if (min > current && current != a[a.length - 1]) {
                min = current;
                index = i;
            }
            if (min < current && current > a[index]) {
                max = current;
            }
            else {
                max=0;
            }
            System.out.println(min + "  " + max + "   " + index);

        }
        System.out.println(max - min);
    }

}

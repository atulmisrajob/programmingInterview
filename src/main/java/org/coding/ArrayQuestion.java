package org.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayQuestion {


    public static void main(String[] args) {

        int[] array = {1, 3, 6, 5, 3, 4, 1};
        secondSmallestNumber(array);
        System.out.println("********************************************************************************");

        int[] array1 = {1, 3, 6, 5, 4};
        int[] array2 = {4, 5, 8, 7, 9};
        commonElementBetweenArray(array1, array2);
        System.out.println("********************************************************************************");

        int[] arrayRev = {1, 2, 3, 4, 5, 6};
        reverseArrayInPlace(arrayRev);
        System.out.println("********************************************************************************");

        String[] name={"Atul","harish","ram","namit","sdsdss"};
        longestLengthString(name);
        System.out.println("********************************************************************************");

        String[] nameDuplicate={"Atul","harish","ram","Atul","namit","harish"};
        removeDuplicateWithoutOrderChange(nameDuplicate);
        System.out.println("********************************************************************************");
    }

    private static void removeDuplicateWithoutOrderChange(String[] nameDuplicate) {
        String[] nameDuplicatek= Arrays.stream(nameDuplicate).distinct().collect(Collectors.toList()).toArray(new String[0]);
        System.out.println(Arrays.toString(nameDuplicatek));
    }

    private static void longestLengthString(String[] name) {
       int maxLength= Arrays.stream(name).mapToInt(n->n.length()).max().orElse(0);
        System.out.println("max length string "+maxLength);
    }

    private static void reverseArrayInPlace(int[] arrayRev) {
        IntStream.range(0, arrayRev.length / 2).forEach(i -> {
            int temp = arrayRev[i];
            arrayRev[i] = arrayRev[arrayRev.length - i - 1];
            arrayRev[arrayRev.length - i - 1] = temp;
        });
        System.out.println("reverse string "+Arrays.toString(arrayRev));
    }

    private static void commonElementBetweenArray(int[] array1, int[] array2) {
        List<Integer> commonElement = Arrays.stream(array1).distinct().filter(num -> Arrays.stream(array2).anyMatch(num2 -> num == num2)).sorted().boxed().collect(Collectors.toList());
        System.out.println("common element" + commonElement);
    }

    private static void secondSmallestNumber(int[] array) {
        int secondSmallestNumber = Arrays.stream(array).distinct().sorted().skip(1)
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Second element not present "));
        System.out.println("second smallest number " + secondSmallestNumber);
    }
}

package org.coding;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static List<Integer> findDuplicates(List<Integer> numbers) {
        // Collect frequencies of each integer and filter the entries with counts > 1
        return numbers.stream()
                .collect(Collectors.groupingBy(number -> number, Collectors.counting())) // Create a map with counts
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1) // Keep only those with frequency > 1
                .map(Map.Entry::getKey) // Extract the keys (the duplicates)
                .toList(); // Convert to List
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 3, 2, 4, 7);
        List<Integer> duplicates = findDuplicates(numbers);
        System.out.println("Duplicate elements: " + duplicates);
    }
}
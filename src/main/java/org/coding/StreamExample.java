package org.coding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        /*record Developer(String name,Integer age, List<String> languages) {}

        var hubert = new Developer("mrhaki",21, List.of("Java", "Groovy", "Clojure"));
        var java = new Developer("gzava",22, List.of("Java"));
        var clojure = new Developer("clojure",45, List.of("Clojure"));
        var groovy = new Developer("groovy",56, List.of("Groovy"));

        List<Developer> developers = List.of(hubert, java, clojure, groovy);

        List<String> heroes = Arrays.asList("Iron Man", "Thor", "Spider Man", "Deadpool", "Hulk");
        List<String> heroList1 = Arrays.asList("Iron Man", "Thor", "Spider Man", "Deadpool", "Hulk");
        List<String> heroList2 = Arrays.asList("Wanda", "Ant Man", "Spider Man", "Doctor Strange", "Hulk");

        String longestString = heroes.stream().max(Comparator.comparing(s -> s.length())).get();
        System.out.printf("Longest string is: %s\n", longestString);

        List<Character> characters = Arrays.asList('c', 'a', 'd', 'a', 'e', 'f', 'a', 'c');
       var frequencyMap= characters.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println("Frequency: " + frequencyMap);

        List<String> commonHeroList =heroes.stream().filter(heroList2::contains).collect(Collectors.toList());
        System.out.println("Common heroes: " + commonHeroList);

        String commandSeparatedString =  heroes.stream().collect(Collectors.joining(","));
        System.out.println("Command separated string: " + commandSeparatedString);

        Set<String> allHeroes= Stream.concat(heroList1.stream(),heroList2.stream()).collect(Collectors.toSet());
        System.out.println("All heroes: " + allHeroes);

        List<Integer> age = Arrays.asList(12, 4, 16, 5, 27);
        Integer maxValue= age.stream().mapToInt(Integer::intValue).max().orElse(-1);
        System.out.println("Max value: " + maxValue);

        int product= age.stream().reduce(1,(a, b)->a*b);
        System.out.println("Product: " + product);

        characters.stream().filter(i->Collections.frequency(characters,i)>1).collect(Collectors.toSet()).forEach(System.out::println);
        heroes.stream().sorted().toList().forEach(System.out::println);

        developers.stream().sorted(Comparator.comparing(Developer::name).thenComparing(Developer::age)).forEach(System.out::println);

        LinkedList<String> linkedNames = Stream.of("Alice", "Bob", "Charlie")
                .collect(Collectors.toCollection(LinkedList::new));

        long count = Stream.of("Java", "Python", "JavaScript", "Java")
                .filter(lang -> lang.equals("Java"))
                .collect(Collectors.counting());

        Map<String, Long> byName = developers.stream()
                .collect(Collectors.groupingBy(dev -> dev.name,Collectors.counting()));
        System.out.println(byName);*/

        String input = "successes";

        Map<Character, Long> charCount = input.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(charCount);
        Character secondMost = charCount.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) // Descending order of frequency
                .skip(1) // Skip the most frequent character
                .findFirst() // Get the second most frequent character
                .map(Map.Entry::getKey)
                .orElse(null);



        String str="AAABBCCCAA";

        Map<Character, Long> charCount1 =str.chars().mapToObj(c->(char)c)
             .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(charCount1);
    }
}

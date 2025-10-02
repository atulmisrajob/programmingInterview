package org.stream.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
        empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

        Map<String, List<Employee>> empByCity;
        empByCity = empList.stream().collect(Collectors.groupingBy(Employee::getCity));

        Map<String, Long> noOfMaleAndFemaleEmployees = empList.stream()
                .collect(Collectors.groupingBy
                        (Employee::getGender, Collectors.counting()));
        System.out.println("Count of male and female employees present in the   organization:: \n" + noOfMaleAndFemaleEmployees);

        Map<String, Double> avgAge = empList.stream().collect(Collectors.groupingBy
                (Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println("Average age of Male and Female Employees:: " + avgAge);


        List<String> heroes = Arrays.asList("Iron Man", "Thor", "Spider Man", "Deadpool", "Hulk");
        String maxLengthString= String.valueOf(empList.stream()
                .max(Comparator.comparing(Employee::getName)).get());
              //   .max(Comparator.reverseOrder()).get(); Deadpool
             //   .max(Comparator.naturalOrder()).get(); Thor
             //   .max(Comparator.comparingInt(String::length)).get(); Spider Man
        System.out.println("maxLengthString  "+maxLengthString);

        List<Character> characters = Arrays.asList('c', 'a', 'd', 'a', 'e', 'f', 'a', 'c');
        Map<Character,Long> frequencyMap= characters.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println("Frequency: " + frequencyMap);

//        Map<Character,Long> frequencyMapl= heroes.stream().map(e->e.chars())
//                .filter(e->!e.equals(' '))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    }
}

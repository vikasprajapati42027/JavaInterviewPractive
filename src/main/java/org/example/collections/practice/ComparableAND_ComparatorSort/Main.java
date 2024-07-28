package org.example.collections.practice.ComparableAND_ComparatorSort;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create an array of Students
        Comparable_SingleSort[] students = {
                new Comparable_SingleSort("Alice", 20),
                new Comparable_SingleSort("Bob", 22),
                new Comparable_SingleSort("Charlie", 18)
        };

        // Sorting the array using Arrays.sort()
        Arrays.sort(students);

        // Print sorted array
        System.out.println("Students sorted by age:");
        for (Comparable_SingleSort student : students) {
            System.out.println(student);
        }
    }
}
package org.example.collections.practice.Date20240822Stream2;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Write Java 8 program to print the most repeated element in an array?
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElementFinder {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 2, 3, 4, 4, 4, 5, 5, 4};

        Map.Entry<Integer, Long> mostRepeatedElementEntry = findMostRepeatedElement(array);

        System.out.println("Most repeated number: " + mostRepeatedElementEntry.getKey());
        System.out.println("Number of occurrences: " + mostRepeatedElementEntry.getValue());
    }

    public static Map.Entry<Integer, Long> findMostRepeatedElement(int[] array) {
        return Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(() -> new IllegalArgumentException("Array is empty"));
    }
}

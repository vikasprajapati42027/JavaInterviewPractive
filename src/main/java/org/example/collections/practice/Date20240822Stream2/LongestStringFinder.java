package org.example.collections.practice.Date20240822Stream2;

import java.util.Arrays;
import java.util.List;

public class LongestStringFinder {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "grapefruit");
        strings.stream().max((s1,s2)->s1.length()-s2.length()).ifPresent(System.out::println);
    }
}

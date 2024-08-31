package org.example.collections.practice.Date20240822Stream2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFreqencyCount {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple banana apple", "banana cherry", "apple banana cherry");
        Map<String,Long> map=words.stream().flatMap(s-> Arrays.stream(s.split(" "))).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}

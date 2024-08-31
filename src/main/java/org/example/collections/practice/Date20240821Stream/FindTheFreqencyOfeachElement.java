package org.example.collections.practice.Date20240821Stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//3) How do you find frequency of each character in a string using Java 8 streams?
public class FindTheFreqencyOfeachElement {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";

       Map<Character,Long> map=inputString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}

package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//2) How do you remove duplicate elements from a list using Java 8 streams?
public class RemoveDuplicateElement {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        List<String> list=listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
    }
}

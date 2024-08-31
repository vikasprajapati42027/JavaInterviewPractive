package org.example.collections.practice.Date20240822Stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write Java 8 program to sort given list of strings according to decreasing order of their length?
public class StringLengthSorter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "orange", "grape", "kiwi");
         strings.stream().sorted((e1,e2)->Integer.compare(e1.length(),e2.length())).forEach(System.out::println);
       List<String> list=strings.stream().sorted((e1,e2)->Integer.compare(e2.length(),e1.length())).collect(Collectors.toList());
        System.out.println(list);
    }
}

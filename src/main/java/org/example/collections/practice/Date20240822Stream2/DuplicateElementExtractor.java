package org.example.collections.practice.Date20240822Stream2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Write Java 8 program to print duplicate elements from an array?
public class DuplicateElementExtractor {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 2, 3, 5, 6, 7, 8, 9, 1};
        Set<Integer> set=new HashSet<>();
        Arrays.stream(array).filter(e->!set.add(e)).forEach(System.out::println);
    }
}

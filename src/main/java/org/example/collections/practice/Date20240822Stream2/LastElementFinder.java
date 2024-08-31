package org.example.collections.practice.Date20240822Stream2;

import java.util.Arrays;
import java.util.List;

public class LastElementFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().reduce((a,b)->b).ifPresent(System.out::println);
    }
}

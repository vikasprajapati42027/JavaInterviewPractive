package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

//Given a list of integers, find maximum and minimum of those numbers?
public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int max=listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        int min=listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Min "+min + "  Max "+max );
    }
}

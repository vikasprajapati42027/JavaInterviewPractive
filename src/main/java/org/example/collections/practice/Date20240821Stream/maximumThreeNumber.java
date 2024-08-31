package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//How do you get three maximum numbers and three minimum numbers from the given list of integers?
public class maximumThreeNumber {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> list=listOfIntegers.stream().limit(3).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(list);
    }
}

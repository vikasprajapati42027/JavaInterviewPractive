package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoUnsortedArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).forEach(System.out::println);


        Integer[] s1={1,2,3,4,5};
        Integer[] s2={6,7,8,9};
        Stream.concat(Arrays.stream(s1),Arrays.stream(s2)).map(e->e+" ").forEach(System.out::print);
    }
}

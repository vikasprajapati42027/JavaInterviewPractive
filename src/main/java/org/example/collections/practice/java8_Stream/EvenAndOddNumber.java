package org.example.collections.practice.java8_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOddNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);

         list.stream().filter(e->e%2==0).forEach(System.out::println);
        list.stream().filter(e->e%2!=0).forEach(System.out::println);
    }
}

package org.example.collections.practice.StreamDate20240619;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListFlatMap {
    public static void main(String[] args) {
        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);

        List<Integer> allone= Stream.of(evens,odds,primes).flatMap(value->value.stream()).collect(Collectors.toList());
        System.out.println(allone);
    }
}

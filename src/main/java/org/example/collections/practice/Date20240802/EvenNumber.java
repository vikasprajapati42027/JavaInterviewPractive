package org.example.collections.practice.Date20240802;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,3,4,55,2,3,44,5);
        list.stream().filter(e->e%2==0).forEach(System.out::println);
    }
}

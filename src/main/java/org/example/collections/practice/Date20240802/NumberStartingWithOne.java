package org.example.collections.practice.Date20240802;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,15,20,34,18,19);
        list.stream().map(s->s+" ").filter(s->s.startsWith("1")).forEach(System.out::println);
    }
}

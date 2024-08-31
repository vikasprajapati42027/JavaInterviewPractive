package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWithOne {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        myList.stream().filter(e->e.toString().startsWith("1")).forEach(System.out::println);


        myList.stream().map(e->e+" ").filter(s->s.startsWith("1")).forEach(System.out::println);

    }
}

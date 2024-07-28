package org.example.collections.practice.java8_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,24,45,23,24,55,333,22,33,44,27);

                 List<Integer> list1= list.stream().map(s->String.valueOf(s)).filter(e->e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());













        List<Integer> value= list.stream().map(S->String.valueOf(S)).filter(s->s.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(value);
    }
}

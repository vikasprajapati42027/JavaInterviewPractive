package org.example.collections.practice.Date20240822Stream2;

import java.util.Arrays;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctCharacterFinder {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");

        Map<String,Long> map=strings.stream().flatMap(s->Arrays.stream(s.split(""))).distinct().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //System.out.println(map);

        Map<String,String> map1=new HashMap<>();
        map1.put("vikas","prajapati");
        map1.put("aakash","kumar");

        boolean ans=map1.containsKey("aakash");
        System.out.println(ans);
        map1.entrySet().stream().map(e->e.getKey().contains("a")).collect(Collectors.toList()).forEach(System.out::println);
    }
}

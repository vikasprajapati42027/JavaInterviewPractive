package org.example.collections.practice.Date20240822Stream2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange","kiwi", "strawberry");
    //   boolean ans=
         Map<String,Long> map=      list.stream().collect(Collectors.groupingBy(str->str, LinkedHashMap::new,Collectors.counting()));
       // System.out.println(ans);
        map.entrySet().forEach(System.out::println);
    }
}

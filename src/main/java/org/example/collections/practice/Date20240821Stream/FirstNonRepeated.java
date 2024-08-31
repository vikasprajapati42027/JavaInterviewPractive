package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        Map<String,Long> count=Arrays.stream(input.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(str->str,Collectors.counting()));
        System.out.println(count);
         Map<String,Long> map= Arrays.stream(input.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

            map.entrySet().stream().filter(e->e.getValue()==1).forEach(System.out::println);
    }
}

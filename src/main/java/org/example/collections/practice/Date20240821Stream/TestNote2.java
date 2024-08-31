package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestNote2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

        Map<String,Long> map=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1)
                        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map);

        Map<String,Long> map1=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println(map1);

    }
}

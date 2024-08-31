package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestNotes {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

        Map<String ,Long> map=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        String str[]={"AA", "BB", "AA", "CC"};

         Map<String,Long> map1= Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                 .entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map1);

        String str1="Vikasprajapati";
        Map<String,Long>  mapchar=Arrays.stream(str1.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mapchar);
    }
}

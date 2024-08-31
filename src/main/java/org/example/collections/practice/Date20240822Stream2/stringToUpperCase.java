package org.example.collections.practice.Date20240822Stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stringToUpperCase {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("vikas","prajapati","jay","kumar","jaykumar");

        String str=list.stream().map(e->e.toUpperCase()).collect(Collectors.joining(","));
       // System.out.println(str);

        list.stream().map(e->e.toUpperCase().charAt(0)+e.substring(1)).forEach(System.out::println);
    }
}

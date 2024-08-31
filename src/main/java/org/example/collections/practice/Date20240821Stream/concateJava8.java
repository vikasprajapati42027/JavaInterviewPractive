package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
Write a Java 8 program to concatenate two Streams?
 */
public class concateJava8 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");


        List<String> str= Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
        System.out.println(str);

        String str1="vikas ";
        String str2="prajapati";
        Stream.concat(Arrays.stream(str1.split("")),Arrays.stream(str2.split(""))).forEach(System.out::print);
    }
}

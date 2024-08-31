package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//4) How do you find frequency of each element in an array or a list?
public class FindTheFreqvencyOFString {
    public static void main(String[] args) {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String,Long> map=stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

       String[] str={"Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil"};
       Map<String,Long> map1= Arrays.stream(str).map(e->e+"").collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map1);

        String str1="pen Eraser notebook pen pencil stapler Notbook pencil";
        Map<String,Long> map2=Arrays.stream(str1.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map2);



    }
}

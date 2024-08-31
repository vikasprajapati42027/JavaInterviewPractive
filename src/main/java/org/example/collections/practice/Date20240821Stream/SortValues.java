package org.example.collections.practice.Date20240821Stream;

import java.sql.SQLOutput;
import java.util.Collections;
import  java.util.List;
import java.util.Arrays;
public class SortValues {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}

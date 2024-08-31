package org.example.collections.practice.Date20240822Stream2;
//Write a program to find the longest string in a list of strings using streams.
import  java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class longest_string {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry");

        Optional<String> list1 = list.stream().max(Comparator.comparingInt(String::length));
        System.out.println(list1);
    }
}

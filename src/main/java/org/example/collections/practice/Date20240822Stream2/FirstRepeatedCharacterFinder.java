package org.example.collections.practice.Date20240822Stream2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Write Java 8 program to find first repeated character in the given string?
public class FirstRepeatedCharacterFinder {
    public static void main(String[] args) {
        String str="hello world";
        Set<String> set=new HashSet<>();
        //str.chars().mapToObj(e->(char)e).filter(e->!set.add(e)).findFirst().ifPresent(System.out::println);
        Arrays.stream(str.split("")).filter(e->!set.add(e)).findFirst().ifPresent(System.out::println);

    }
}

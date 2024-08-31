package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
public class joinedString {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String res=listOfStrings.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(res);
    }
}

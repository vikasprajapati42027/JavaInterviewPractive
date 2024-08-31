package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Java 8 program to check if two strings are anagrams or not?
public class anagrams {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        s1= Stream.of(s1.split("")).sorted().collect(Collectors.joining());
        s2= Stream.of(s2.split("")).sorted().collect(Collectors.joining());

      //  s1= Arrays.stream(s1.split("")).sorted().collect(Collectors.joining());
        if(s1.equals(s2))
        {
            System.out.println("yes");
        }else
        {
            System.out.println("no");
        }
    }
}

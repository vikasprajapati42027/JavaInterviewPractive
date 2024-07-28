package org.example.collections.practice.java8_Stream;

import java.util.Arrays;
import java.util.List;

public class NumberSqureAverage {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,100,400,900,255);


          Double doub=list.stream().map(e->e*e).filter(e->e>100).mapToInt(e->e).average().getAsDouble();
        System.out.println(doub);


    }
}

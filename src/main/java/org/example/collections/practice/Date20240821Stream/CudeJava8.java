package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.List;

public class CudeJava8 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);

        integerList.stream().map(e->e*e*e).forEach(System.out::println);
        integerList.stream().reduce((a,b)->(a+b)).ifPresent(System.out::println);
    }
}

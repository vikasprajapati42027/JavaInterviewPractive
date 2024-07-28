package org.example.collections.practice.java8_Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class AverageNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        Long count=list.stream().count();

         Integer output= list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println(output);


        Optional<Integer> sum= list.stream().reduce((a, b)->a+b);
       // System.out.println((new Long(String.valueOf(sum)) /count));

        Double doub=list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(doub);
    }
}

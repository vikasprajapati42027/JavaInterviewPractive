package org.example.collections.practice.java8_Stream;

import org.apache.poi.sl.draw.geom.GuideIf;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class sumOFNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        //list.stream().map(x->x+x).collect(Collectors.toList()).forEach(System.out::println);
        Optional<Integer> sum=list.stream().reduce((a,b)->a+b);
        System.out.println(sum);

        Optional<Integer> sum1= list.stream().reduce((a,b)->a+b);
        System.out.println(sum1);


    }
}

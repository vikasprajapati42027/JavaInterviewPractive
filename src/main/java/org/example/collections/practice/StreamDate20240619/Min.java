package org.example.collections.practice.StreamDate20240619;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Min {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,22,3,30,2,35,46);

        Optional<Integer> list1=list.stream().min((a, b)->a.compareTo(b));

        System.out.println(list1);
    }
}

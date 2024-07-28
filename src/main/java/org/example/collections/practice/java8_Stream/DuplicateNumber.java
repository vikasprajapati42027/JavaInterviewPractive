package org.example.collections.practice.java8_Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,1,2,3,4,5,6,7,2,3,4);







        Set<Integer> set=list.stream().filter(e-> Collections.frequency(list,e)>1).collect(Collectors.toSet());
        System.out.println(set);


    }
}

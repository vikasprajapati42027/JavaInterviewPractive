package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set=new HashSet<>();
      //  List<Integer> l=myList.stream().filter(e->!set.add(e)).collect(Collectors.toList());


       ;
        List<Integer> l=myList.stream().filter(e->!set.add(e)).collect(Collectors.toList());


       // List<Integer> l=myList.stream().filter(e->!set.add(e)).collect(Collectors.toList());
        System.out.println(l);

        List<Integer> list=myList.stream().map(e->e*e).filter(e->e>50).collect(Collectors.toList());
       // System.out.println(list);
    }
}

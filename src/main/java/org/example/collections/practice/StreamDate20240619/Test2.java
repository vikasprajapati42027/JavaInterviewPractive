package org.example.collections.practice.StreamDate20240619;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
//        List<String> stringList=new ArrayList<>();
//        stringList.add("one");
//        stringList.add("two");
//        stringList.add("three");
//        stringList.add("four");
//        stringList.add("five");
//
//        List<String> list=stringList.stream().map(value-> value.toUpperCase()).collect(Collectors.toList());
//        System.out.println(list);
//
//        long count1=stringList.stream().map(value->value.toUpperCase()).count();
//        System.out.println(count1);
        pramid();
    }
    public static void pramid()
    {
        for(int i=0;i<5;i++)
        {
          for(int j=0;j<5-i;j++)
              System.out.print(" ");
          for(int k=0;k<=i;k++)
              System.out.print(k+" ");
            System.out.println();
        }
    }
}

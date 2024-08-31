package org.example.collections.practice.StreamDate20240619;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class find_duplicate_elements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set=new HashSet<>();
       // myList.stream().filter(n->!set.add(n)).forEach(System.out::println);
       // myList.stream().filter(n->set.add(n)).forEach(System.out::println);

        for(Integer i:myList)
        {
            if(!set.add(i))
            {
                System.out.println(i);
            }
        }

    }
}

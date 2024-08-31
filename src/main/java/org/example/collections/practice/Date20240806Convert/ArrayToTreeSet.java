package org.example.collections.practice.Date20240806Convert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArrayToTreeSet {


    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6};
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(arr));
        Set<Integer> treeset=new TreeSet<>(al);
        for(Integer i:treeset)
        {
            System.out.println(i);
        }

    }
}

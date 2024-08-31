package org.example.collections.practice.Date20240826Array;

import java.util.HashSet;
import java.util.Set;

public class Removeduplicates {
    public static void main(String[] args) {
        int arr[]={2,2,2,2,2};
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        for(Integer s:set)
        {
            System.out.println(s);
        }
    }
}

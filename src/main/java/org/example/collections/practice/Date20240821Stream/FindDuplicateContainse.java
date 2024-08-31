package org.example.collections.practice.Date20240821Stream;
/*Given an integer array nums, return true if any value appears at
least twice in the array, and return false if every element is distinct./*
 */


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateContainse {
    public static boolean containsDuplicate(int[] arr)
    {
        List<Integer>  list= Arrays.stream(arr).boxed().collect(Collectors.toList());
        Set<Integer> set=new HashSet<>(list);
        if(set.size()==list.size())
            return false;
        else
            return true;


    }
    public static void main(String[] args) {
      int[] arr={1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}

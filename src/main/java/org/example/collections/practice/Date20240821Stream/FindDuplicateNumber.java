package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateNumber {
    public static int  findDuplicateNumberByJava1_8(int[] n)
    {
        Map<Integer,Long> map= Arrays.stream(n).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       int dup = map.keySet().stream().filter(x->map.get(x)>1).findFirst().orElse(0);

       return dup;

    }
    public static void main(String[] args) {
        int a[] = { 1, 4, 5, 2, 12, 34, 2, 11 };
        System.out.println("Duplicate number by java 1.8 : " + findDuplicateNumberByJava1_8(a));
    }
}

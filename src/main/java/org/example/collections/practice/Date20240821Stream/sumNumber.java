package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class sumNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int res=Arrays.stream(arr).sum();
        System.out.println(res);
    }
}

package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;

public class averageNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        double res=Arrays.stream(arr).average().getAsDouble();
        System.out.println(res);
    }
}

package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;

public class LastElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Arrays.stream(array).skip(array.length-1).findFirst().ifPresent(System.out::println);

        int res=Arrays.stream(array).reduce((a,b)->b).getAsInt();
        System.out.println(res);
    }
}

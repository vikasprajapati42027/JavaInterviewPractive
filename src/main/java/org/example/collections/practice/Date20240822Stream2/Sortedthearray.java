package org.example.collections.practice.Date20240822Stream2;

import java.util.Arrays;

public class Sortedthearray {
    public static void main(String[] args) {
        int[] arr={30,5,03,4,55,66};
        Arrays.stream(arr).boxed().sorted((a,b)->Integer.compare(a,b)).forEach(System.out::println);
    }
}

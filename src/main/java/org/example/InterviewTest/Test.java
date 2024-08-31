package org.example.InterviewTest;

//        *****
//        *   *
//        *   *
//        *   *
//        *****

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int sum=Arrays.stream(arr).sum();

       Arrays.stream(arr).map(e->e+sum).forEach(System.out::println);
        System.out.println(sum);
    }
}

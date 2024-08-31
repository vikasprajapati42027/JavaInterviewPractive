package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;

public class checkTheContainDUplicateOrNot {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,1};
        if(Arrays.stream(arr).distinct().count()==arr.length)
        {
            System.out.println("yes");
        }else {
            System.out.println("not");
        }
    }
}

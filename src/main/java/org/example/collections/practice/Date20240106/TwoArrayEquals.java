package org.example.collections.practice.Date20240106;

import java.util.Arrays;

public class TwoArrayEquals {
    public static void main(String[] args) {
        int arr1[]={1,3,4,5,6};
        int arr2[]={1,3,4,5,6};
        boolean ans= Arrays.equals(arr1,arr2);
        if(ans)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}

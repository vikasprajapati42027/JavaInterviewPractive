package org.example.collections.practice.Date20240126;

import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int brr[]={4,5,6,7};
        intersection(arr,brr);
    }
    public static void intersection(int arr[],int brr[])
    {
        HashSet hs=new HashSet();
        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        for(int i=0;i<brr.length;i++)
        {
            if(hs.contains(brr[i]))
            {
                System.out.println(brr[i]);
            }
        }
    }
}

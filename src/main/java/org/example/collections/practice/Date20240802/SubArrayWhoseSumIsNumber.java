package org.example.collections.practice.Date20240802;

import java.util.Arrays;

public class SubArrayWhoseSumIsNumber {
    public static void findSubArray(int[] arr,int n)
    {
       int sum=0;
        for(int i=0;i<arr.length;i++)
        {
             sum=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                sum+=arr[j];
                if(sum==n)
                {
                    for(int k=i;k<=j;k++)
                    {
                        System.out.println(arr[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
    }
}

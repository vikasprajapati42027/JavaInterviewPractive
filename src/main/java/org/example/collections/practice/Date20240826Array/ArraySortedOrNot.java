package org.example.collections.practice.Date20240826Array;

public class ArraySortedOrNot {
    public static boolean check(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(check(arr));
    }
}

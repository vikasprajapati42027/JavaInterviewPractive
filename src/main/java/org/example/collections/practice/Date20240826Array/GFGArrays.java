package org.example.collections.practice.Date20240826Array;

public class GFGArrays {
    public static void number(int arr[],int d)
    {
        int[] temp=new  int[arr.length];
        int c=0;
        int c1=0;
        for(int i=d;i<arr.length;i++)
        {
            temp[c1++]=arr[i];
        }
        for(int i=0;i<d;i++)
        {
            temp[c1++]=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;

         number(arr,d);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

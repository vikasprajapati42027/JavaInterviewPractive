package org.example.collections.practice.Date20240113;

public class allZerowithend {
    public static void ZeroLast(int arr[],int n)
    {
        int zeroc=0;
      //  int n=arr.length-1;
        int zero[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                zero[zeroc++]=arr[i];
            }

        }
        while(zeroc<=n)
        {
            zero[zeroc++]=0;
        }
        for(int i=0;i<zeroc;i++)
        {
            System.out.println(zero[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        ZeroLast(arr,arr.length-1);

    }
}

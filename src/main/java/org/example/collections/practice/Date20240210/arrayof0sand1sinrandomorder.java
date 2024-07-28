package org.example.collections.practice.Date20240210;

public class arrayof0sand1sinrandomorder {
    public static int[] zeroandone(int arr[])
    {
        int count=0;
        int brr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
           {
               count++;
           }
        }
        for(int i=0;i<count;i++)
        {
            arr[i]=0;
        }
        for(int i=count;i<arr.length;i++)
        {
            brr[i]=1;
        }
        return brr;
    }
    public static void main(String[] args) {
       int arr[]={0,1,0,0,1,1,1,0,1};
       arr=zeroandone(arr);
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]);
       }
    }
}

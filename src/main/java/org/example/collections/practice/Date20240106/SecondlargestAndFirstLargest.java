package org.example.collections.practice.Date20240106;

public class SecondlargestAndFirstLargest {
    public static void main(String[] args) {
        int arr[]={1,44,5,6,77,8,8,99};
        int secondlargest=Integer.MIN_VALUE;
        int firstlargest=Integer.MIN_VALUE;
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
             if(arr[i]>firstlargest)
             {
              secondlargest=firstlargest;
              firstlargest=arr[i];
             }
             else if(arr[i]>secondlargest)
             {
                 secondlargest=arr[i];
             }
        }
        System.out.println(secondlargest + " "+ firstlargest);
    }
}

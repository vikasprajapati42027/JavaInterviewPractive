package org.example.collections.practice.Date20240826Array;

public class rightrotated {
    public static void isRotate(int[] arr,int d)
    {
        int c=0;
        int[] temp=new int[arr.length];
        for(int i=d;i<arr.length;i++)
        {
             temp[c++]=arr[i];
        }
        for(int i=0;i<d;i++)
        {
            temp[c++]=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int Array[] = {1, 2, 3, 4, 5};
        isRotate(Array,2);
        for(int i=0;i<Array.length;i++)
        {
            System.out.println(Array[i]);
        }
    }
}

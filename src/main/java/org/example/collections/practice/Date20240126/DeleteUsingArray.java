package org.example.collections.practice.Date20240126;

public class DeleteUsingArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int brr[]=new int[arr.length];
        int index=3;
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i!=(index-1))
            {
                brr[c++]=arr[i];
            }

        }
        for(int j=0;j<c;j++)
        {
            System.out.println(brr[j]);
        }
    }
}

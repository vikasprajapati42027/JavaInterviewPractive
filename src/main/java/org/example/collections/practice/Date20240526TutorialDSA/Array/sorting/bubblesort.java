package org.example.collections.practice.Date20240526TutorialDSA.Array.sorting;

public class bubblesort {
    public static void main(String[] args) {
        int arr[]={6,5,4,8,2,7};
        int temp=0;
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<6;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

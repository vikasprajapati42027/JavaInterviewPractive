package org.example.collections.practice.Date20231203;

public class QuickSort {
    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partiton(int arr[],int l,int h)
    {
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<h-1;j++)
        {
            if(arr[j]<pivot)
                i++;
            swap(arr,i,j);
        }
        swap(arr,i+1,h);
        return i+1;
    }
    static void QuickSort(int arr[],int l,int h)
    {
        if(l<h)
        {
            int pi=partiton(arr,l,h);
            swap(arr,l,pi-1);
            swap(arr,pi+1,h);

        }
    }
    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
      int arr[]={34,12,53,77,34,99};
      int n=arr.length;
      QuickSort(arr,0,n-1);
      printArr(arr);
    }
}

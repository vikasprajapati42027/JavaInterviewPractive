package org.example.collections.practice.Date20231203;

public class pairSum {
    public static boolean isSum(int arr[],int x)
    {
        int n=arr.length-1;

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[i]+arr[j]==x)
                {
                   return true;

                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,4,3,6,7,2,5};
        int n=arr.length-1;
        int x=93;
        System.out.println(isSum(arr,x));

    }
}

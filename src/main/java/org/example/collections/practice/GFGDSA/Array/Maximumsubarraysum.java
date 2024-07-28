package org.example.collections.practice.GFGDSA.Array;

public class Maximumsubarraysum {
    public static int maxsum(int arr[],int n)
    {
        int res=arr[0];
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[i];
                res=Math.max(res,sum);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxsum(arr,arr.length-1));

    }
}

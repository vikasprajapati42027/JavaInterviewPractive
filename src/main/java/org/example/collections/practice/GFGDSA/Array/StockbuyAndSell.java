package org.example.collections.practice.GFGDSA.Array;

public class StockbuyAndSell {
    public static int maxProfit(int arr[],int n)
    {
        int profit=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1]) {
                profit += (arr[i] - arr[i - 1]);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 2, 4};
        System.out.println(maxProfit(arr,arr.length));
    }

    public int maxProfit1(int arr[],int n)
    {
        int profit=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
            profit+=arr[i]-arr[i-1];

        }
        return profit;
    }
}

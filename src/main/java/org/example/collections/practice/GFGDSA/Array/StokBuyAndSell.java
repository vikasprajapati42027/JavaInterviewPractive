package org.example.collections.practice.GFGDSA.Array;

public class StokBuyAndSell {
    public static int maxProfite(int arr[],int start,int end)
    {
        if(end<=start)
            return 0;
        int profit=0;
        for(int i=start;i<end;i++)
        {
            for(int j=i+1; j<=end;j++)
            {
                if(arr[j]>arr[i])
                {
                    int currprofit=arr[j]-arr[i]+maxProfite(arr,start,i-1)+maxProfite(arr,j+1,end);
                    profit=Math.max(profit,currprofit);
                }
            }
        }
        return  profit;
    }
    public static void main(String[] args) {
      int arr[] = {4, 2, 2, 2, 4};
        System.out.println(maxProfite(arr,0,arr.length-1));
    }

    {

    }
}

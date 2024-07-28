package org.example.collections.practice.GFGDSA.Array;

public class Maximumconsecutive1s {
    public static int maxicon(int arr[],int n)
    {
        int res=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=i;j<n;j++)
            {
                if(arr[j]==1)
                    count++;
                else
                break;
            }
            res=Math.max(res,count);
        }
        return res;
    }
    public static void main(String[] args) {
      int  arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        System.out.println(maxicon(arr,arr.length));
    }
    public static int getCon(int arr[],int n)
    {
        int res=0;
        for(int i=0;i<n;i++)
        {
            int curr=0;
            for(int j=i;j<n;j++)
            {
                if(arr[i]==0)
                {
                    curr=0;
                }else {
                    curr++;
                    res=Math.max(res,curr);
                }
            }

        }
        return res;
    }
}

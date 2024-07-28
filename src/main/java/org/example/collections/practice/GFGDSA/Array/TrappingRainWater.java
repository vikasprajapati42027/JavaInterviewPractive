package org.example.collections.practice.GFGDSA.Array;

public class TrappingRainWater {


    public int traRain(int arr[],int n)
    {
    int res=0;
        for(int i=1;i<n-1;i++) {
            int lmax = arr[i];
            for(int j=0;j<i;j++)
                lmax=Math.max(lmax,arr[j]);
            int rmax=arr[i];
            for(int j=i+1;j<n;j++)
                rmax=Math.max(rmax,arr[j]);

            res=res+Math.min(lmax,rmax)-arr[i];

        }
          return res;
    }
    public static void main(String[] args) {
      int   arr[]   = {3, 0, 2, 0, 4};
      int n=5;
        System.out.println(maxvalue1(arr,n));
    }

    public static  int maxvalue1(int arr[],int n)
    {
        int res=0;
        for(int i=1;i<n-1;i++)
        {
            int lmax=arr[i];
            for(int j=0;j<i;j++)
                lmax=Math.max(lmax,arr[j]);
                int rmax=arr[i];
                for(int j=i+1;j<n;j++)
                    rmax=Math.max(rmax,arr[j]);

                res=res+Math.min(lmax,rmax)-arr[i];

        }
        return res;
    }
}

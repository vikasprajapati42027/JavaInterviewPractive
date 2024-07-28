package org.example.collections.practice.GFGDSA.Array;

public class maxVaule {

     public static int maxvale(int arr[],int n)
     {
         int res=arr[1]-arr[0];
         int maxvau=arr[0];
         for(int i=0;i<n;i++)
         {
             res=Math.max(res,arr[i]-maxvau);
             maxvau=Math.min(maxvau,arr[i]);
         }
    return   res;
     }
//     #############################
    public static int maxNumber(int arr[],int n) {

        int result = arr[1] - arr[0];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                result=Math.max(result,arr[j]-arr[i]);
            }
        }
   return result; }

    public static void main(String[] args) {

    }
}

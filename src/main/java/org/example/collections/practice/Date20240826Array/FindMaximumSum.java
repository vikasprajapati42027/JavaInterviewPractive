package org.example.collections.practice.Date20240826Array;

public class FindMaximumSum {
    public static int sumcheck(int[] arr)
    {
        int sum=0;
                int current=0;
        for(int i=0;i<arr.length;i++)
        {
            current=Math.max(arr[i],current+arr[i]);
            sum=Math.max(current,sum);

        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(sumcheck(arr));


    }
}

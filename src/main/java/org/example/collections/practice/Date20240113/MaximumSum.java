package org.example.collections.practice.Date20240113;

public class MaximumSum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum=0;
        int currsum=0;
        for(int i=0;i<nums.length;i++)
        {
            currsum+=nums[i];
            if(currsum>sum)
            {
               sum=currsum;
            }
            if(currsum<0) {
                currsum = 0;
            }
        }
        System.out.println(sum);



    }
}

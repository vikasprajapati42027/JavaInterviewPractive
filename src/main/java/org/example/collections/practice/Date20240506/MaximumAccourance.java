package org.example.collections.practice.Date20240506;

public class MaximumAccourance {
    public static void main(String[] args) {
        int arr[]={0,1,1,1,0,1,0,1,1,1,1,0};
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            int c=0;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]==1) {
                    c++;
                }else
                {
                    break;
                }

            }
            res=Math.max(res,c);

        }
        System.out.println(res);
    }
}

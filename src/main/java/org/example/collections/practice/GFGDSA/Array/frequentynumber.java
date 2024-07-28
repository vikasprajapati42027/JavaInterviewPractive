package org.example.collections.practice.GFGDSA.Array;

public interface frequentynumber {
    public static void frenum(int arr[],int n)
    {
        int freq=1,i=1;
        while(i<n)
        {
            while(i<n && arr[i]==arr[i-1])
            {
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+ freq);
            i++;
            freq=1;
        }
        if(n==1 || arr[n-1]!=arr[n-2])

            System.out.println(arr[i-1]+" "+ 1);

    }
    public static void main(String[] args) {

    }

//    public void freNumber1(int arr[],int n)
//    {
//        int freq=1,i=1;
//        while(i<n)
//        {
//            while(i<n && arr[i]==arr[i-1])
//            {
//                freq++;
//                i++;
//            }
//        }
//    }
}

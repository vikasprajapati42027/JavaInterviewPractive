package org.example.collections.practice.Date20240826Array;

public class binarytodecimal {
    public static void isbinary(int n)
    {
        int res=0;
        int sum=0;
        int base=1;

        while(n!=0)
        {
            res=n%10;
            n=n/10;
            sum+=res*base;
            base=base*2;

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int n=101;
        isbinary(n);
    }
}

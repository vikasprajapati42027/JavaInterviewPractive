package org.example.collections.practice.Test.ThreadTest;

public class BinaryToDecimal {
    public static int BinToDec(int n)
    {
        int num=n;
        int res=0;
        int base=1;
        int temp=num;
        int decimal=0;
        while(temp!=0)
        {
            res=temp%10;
            temp=temp/10;
            decimal+=res*base;
            base =base*2;
        }
        return decimal;
    }
    public static void main(String[] args) {
        int n=101;
        System.out.println(BinToDec(n));
    }
}

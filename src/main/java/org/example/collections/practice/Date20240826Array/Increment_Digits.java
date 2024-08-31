package org.example.collections.practice.Date20240826Array;

public class Increment_Digits {
    public static void main(String[] args) {
        int n=4567;
        int res=0;
        int temp=0;
        while(n!=0)
        {
            temp=n%10;
            temp++;
            res=res*10+temp;
            n=n/10;
        }
        System.out.println(res);
        int res1=0;
        int temp1=0;
        while(res!=0)
        {
            temp1=res%10;
            res1=res1*10+temp1;
            res=res/10;
        }
        System.out.println(res1);
    }
}

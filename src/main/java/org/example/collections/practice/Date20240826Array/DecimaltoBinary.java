package org.example.collections.practice.Date20240826Array;

public class DecimaltoBinary {
    public static void decimal(int n)
    {
        int[] binary=new int[1000];
        int res=1;
        int temp=0;
        int i=0;
        while(n!=0)
        {
            binary[i]=n%2;
            n/=n/2;
            i++;
           // res=res+temp;

        }
        for(int j=i-1;j>=0;j--) {
            System.out.println(binary[j]);
        }
    }
    public static void main(String[] args) {
        int n=3;
        decimal(n);
    }
}

package org.example.collections.practice.Date20240802;

public class MagicNumber {
    public static void main(String[] args) {
       int sum=0;
       int number= 1172;
       int n=number;
       while(n>0 || sum>9)
       {
           if(n==0)
           {
               n=sum;
               sum=0;
           }
           sum+=n%10;
           n=n/10;
       }
       if(sum==1)
       {
           System.out.println("yes");
       }else {
           System.out.println("not");
       }
    }
}

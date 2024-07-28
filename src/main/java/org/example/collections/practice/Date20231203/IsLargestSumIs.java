package org.example.collections.practice.Date20231203;

public class IsLargestSumIs {

    public static int isPrime(int m)
    {

        int i;
        int n=m;
        for( i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                n/=i;
                i--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int n=6;
        System.out.println(isPrime(n));

    }
}

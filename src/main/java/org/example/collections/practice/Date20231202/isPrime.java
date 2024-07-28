package org.example.collections.practice.Date20231202;

public class isPrime {

    public static boolean isPrimes(int n)
    {
        if(n==0||n==1)
        {
            return  false;
        }
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;



    }

    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++)
        {
            if(isPrimes(i))
            {
                System.out.println(i);
            }
        }
    }
}

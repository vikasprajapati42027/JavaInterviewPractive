package org.example.collections.practice.GFGDSA.Math;

import java.sql.SQLOutput;

public class sieveoferato {
    public static  boolean  isprime(int n)
    {
        boolean f=true;
        if(n==0 || n==1)
        {
            return false;
        }
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                f=true;

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n=10;
        for(int i=2;i<=10;i++)
        {
            if(isprime(i))
                System.out.println(i);

        }
    }
}

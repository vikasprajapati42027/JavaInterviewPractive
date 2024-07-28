package org.example.collections.practice.Date20240113;

public class Largest {

    public static boolean isPrime(int n)
    {
        int flag=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }

        }
        if(flag==0)
        {
            return  true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
      System.out.println(isPrime(8));

    }
}

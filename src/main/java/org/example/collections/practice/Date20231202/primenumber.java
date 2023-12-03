package org.example.collections.practice.Date20231202;

public class primenumber {

    /*
     *   The class can only be Main
     */

    public static void main(String []args) {
        // code here

        int n=6;

        int count =0;
        int flag=0;

//        for(int i=2;i<n/2;i++)
//        {
//            if(isPrime(i))
//            {
//                count ++;
//            }
//        }
        for(int i=2;i<n;i++) {
            System.out.println("Prime number is :- "+i+  " " + isPrime(i));
            count++;
        }
        System.out.println("Prime count is :- " + count);


    }

    public static boolean isPrime(int n)
    {

        int flag=1;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                flag=0;
                break;

            }
        }
        if(flag==1)
        {
            return true;
        }
        else{
            return false;
        }
    }

}






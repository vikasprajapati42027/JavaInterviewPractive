package org.example.collections.practice.Date20240821Stream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimeNumber {

//     public static boolean isprimeJava8(int n)
//     {
//         if(n==0||n==1)
//             return false;
//         if(n==2)
//             return  true;
//         boolean isprime=IntStream.rangeClosed(2,n/2).noneMatch(e->n%e==0);
//         return isprime;
//     }

     public static boolean isprimenumber(int n)
     {
         if(n==0||n==1)
             return false;
         if(n==2)
             return true;
         boolean isprime= IntStream.rangeClosed(2,n/2).noneMatch(e->n%e==0);

         return isprime;
     }
    public static void main(String[] args) {
        System.out.println(isprimenumber(7));

    }
}

package org.example.collections.practice.Date20231202;

public class numer1tp10 {
    public static int number(int n)
    {
          if(n==0)
          {
              return 0;
          }

        return number(n-1);
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(number(n));
    }
}

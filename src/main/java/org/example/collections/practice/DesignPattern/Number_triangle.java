package org.example.collections.practice.DesignPattern;

public class Number_triangle {
    public static void main(String[] args) {

        for(int i=0;i<5;i++)
        {
            int count=1;
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
           // System.out.println();
            for(int k=0;k<i;k++)
            {

                System.out.print(i+" ");
                count++;
            }
            System.out.println();
        }
    }
}

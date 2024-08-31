package org.example.collections.practice.DesignPattern;

public class Hollow_Triangle {
    public static void main(String[] args) {
        int i,j,k;
        for(i=0;i<=5;i++)
        {
            for(j=i;j<5;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<=(2*i)-1;k++)
            {
                if(k==1||i==5||k==(2*i)-1)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

package org.example.collections.practice.DesignPattern;

public class Revers_Right_Half_Pyramid {
    public static void main(String[] args) {
        for(int i=5;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

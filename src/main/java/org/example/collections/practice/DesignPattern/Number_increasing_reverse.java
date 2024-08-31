package org.example.collections.practice.DesignPattern;

public class Number_increasing_reverse {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

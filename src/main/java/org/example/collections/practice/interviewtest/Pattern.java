package org.example.collections.practice.interviewtest;

public class Pattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        int count=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }

    }
}

package org.example.collections.practice.DesignPattern;

public class Number_increasing {
    public static void main(String[] args) {

        int count =1;
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
                count++;
            }
            System.out.println();
        }
    }
}

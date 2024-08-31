package org.example.collections.practice.DesignPattern;

public class pascalTribgle {
    public static void main(String[] args) {
        for(int i=0;i<=7;i++)
        {
            int c=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(c+ " ");

                c=c*(i-j)/j;
            }
            System.out.println();



        }
    }
}

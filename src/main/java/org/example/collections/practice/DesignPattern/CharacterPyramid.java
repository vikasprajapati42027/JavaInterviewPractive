package org.example.collections.practice.DesignPattern;

public class CharacterPyramid {
    public static void main(String[] args) {
        char ch='A';
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++)
            {
                System.out.print(ch);
                if(k<i) {
                    ch++;

                }else
                    ch--;
            }
           ch='A';
            System.out.println();
        }
    }
}

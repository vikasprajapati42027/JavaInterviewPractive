package org.example.collections.practice.Date20240802;

public class countthedigiteinString {
    public static void main(String[] args) {
        String str = "GeeksforGeeks password is : 1234";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                count++;
            }
        }
        //System.out.println(count);

        for(int i=0;i<5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

package org.example.collections.practice.Date20240210;

public class AllSuntring {
    public static void main(String[] args) {
        String str="vikas";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                System.out.println(str.substring(i,j));
            }
        }
    }
}

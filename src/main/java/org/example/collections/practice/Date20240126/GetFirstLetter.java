package org.example.collections.practice.Date20240126;

public class GetFirstLetter {

    public static void main(String[] args) {
        String str="my name is vikas";
        String words[]=str.split(" ");
        for(String s:words)
        {
            System.out.print(s.charAt(0)+ " ");
        }
    }
}

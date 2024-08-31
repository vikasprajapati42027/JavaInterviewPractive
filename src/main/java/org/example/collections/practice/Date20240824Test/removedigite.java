package org.example.collections.practice.Date20240824Test;

public class removedigite {
    public static void main(String[] args) {
        String str="245ja89va";
        String res="";
        for(int i=0;i<str.length();i++)
        {
            if(Character.isAlphabetic(str.charAt(i)))
            {
             res=res+str.charAt(i);
            }
        }
        System.out.println(res);
    }
}

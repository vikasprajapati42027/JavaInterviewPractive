package org.example.collections.practice.Date20231203;

import java.util.Arrays;

public class reverseword {

    public  static String reverse(String str)
    {
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String str="i love programming very much";
        String words[]=str.split("\\s");
        String ans="";
        for(int i=words.length-1;i>=0;i--)
        {
            ans+=words[i]+" ";
        }
        System.out.println(ans.substring(0,ans.length()-1));


    }
}

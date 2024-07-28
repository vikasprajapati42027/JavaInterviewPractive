package org.example.collections.practice.Date20240210;

import java.util.Locale;

public class FirstWordInUpper {
    public static void main(String[] args) {
        String str="my name is vikas prajapati";
        String words[]=str.split("\\s");
       for(String word:words) {
           System.out.print(FirstCapital(word)+" ");
       }
    }
    public static String FirstCapital(String str)
    {
        String ans="";
       // StringBuffer sb=new StringBuffer();
        //sb.append(str.toUpperCase().charAt(0)).append(str.substring(1,str.length()));
        ans+=str.toUpperCase().charAt(0)+str.substring(1,str.length());
       // return String.valueOf(sb);
        return  ans;
    }
}

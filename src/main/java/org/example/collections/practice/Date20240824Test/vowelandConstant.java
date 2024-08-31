package org.example.collections.practice.Date20240824Test;

import java.util.Arrays;

public class vowelandConstant {
    public static void main(String[] args) {
        String str="a";
        boolean ans=Arrays.stream(str.split("")).anyMatch(e->e.matches("[aeiou]"));
       // System.out.println(ans);

        String str1="a2b3c4d5";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str1.length();i+=2)
        {
            char c=str1.charAt(i);
            int count=Character.getNumericValue(str1.charAt(i+1));
            for(int j=0;j<count;j++)
            {
                sb.append(c);
            }

        }



        ////System.out.println(output.toString());
        System.out.println(sb.toString());
    }
}

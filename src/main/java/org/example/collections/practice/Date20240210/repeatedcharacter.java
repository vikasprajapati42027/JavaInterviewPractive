package org.example.collections.practice.Date20240210;

public class repeatedcharacter {
    public static void main(String[] args) {
        String str="abcabcbb";
        int ss=0,ll=0;
        for(int i=0;i<str.length();i++)
        {
            char c =str.charAt(i);
            int j=i;
            while(j<str.length() && str.charAt(j)==str.charAt(i))
            {
                j++;
            }
            if(j-i>ll)
            {
                ss=i;
                ll=j-i;
            }
        }
        System.out.println(str.substring(ss,ss+ll));


    }
}

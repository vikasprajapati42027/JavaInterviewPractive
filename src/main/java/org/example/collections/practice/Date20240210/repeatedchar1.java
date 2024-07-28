package org.example.collections.practice.Date20240210;

import java.util.HashSet;
import java.util.Set;

public class repeatedchar1 {
    public static void main(String[] args) {
        String str="prajapati";
        int ss=0,ll=0;
        //int j=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int j=i;
            if(j<str.length()&& str.charAt(i)==ch)
            {
                j++;
            }else {
                ss=i;
                ll=j-i;
            }
            str.substring(ss,ss+ll);
        }
    }
}

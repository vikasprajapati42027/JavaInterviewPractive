package org.example.collections.practice.Date20240210;

import java.util.HashSet;
import java.util.Set;

public class logestnotrepeatedchar {
    public static void main(String[] args) {
        String str="prajapati";
        int ss=0,ll=0;
        int i=0,j=0;
        int n=str.length();
        String ans="";
        Set<Character> set=new HashSet<>();
        while(i<n && j<n)
        {
            if(!set.contains(str.charAt(j)))
            {
                set.add(str.charAt(j++));

                if(j-i>ll)
                {
                    ss=i;
                    ll=j-i;
                }

            }else {
                set.remove(str.charAt(i++));
            }




        }


       
        System.out.println(str.substring(ss,ss+ll));


    }
}

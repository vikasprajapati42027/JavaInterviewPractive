package org.example.collections.practice.Date20240126;

import java.util.HashSet;
import java.util.Set;

public class ReverseString {
    public static String logest(String str)
    {
        Set<Character> set=new HashSet<>();
        int s=0,l=0;
        int i=0,j=0;
        int n=str.length();

        while(i<n&&j<n)
        {
          if(!set.contains(str.charAt(i)))
          {
              set.add(str.charAt(i));
              if(j-1>l )
              {
                  l=i;
                  s=j-i;
              }
                i++;
          }else {
              set.remove(str.charAt(j));
              j++;
          }
        }
        return str.substring(s,s+l);
    }
    public static void main(String[] args) {
        String str="abcabcbb";
        System.out.
                println(logest(str));
    }
}

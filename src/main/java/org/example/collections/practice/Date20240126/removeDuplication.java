package org.example.collections.practice.Date20240126;

import java.util.HashSet;
import java.util.Set;

public class removeDuplication {
    public static String removeDu(String str)
    {
        Set<Character> set=new HashSet<>();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++) {
            if (!set.contains(str.charAt(i))) {
                set.add(str.charAt(i));
                sb.append(str.charAt(i));
            }
        }
        return  sb.toString();
    }
    public static void main(String[] args) {
        String str="abcabcdd";
        System.out.println(removeDu(str));
    }
}

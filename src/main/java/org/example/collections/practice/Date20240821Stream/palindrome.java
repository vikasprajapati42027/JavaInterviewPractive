package org.example.collections.practice.Date20240821Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class palindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean ans= IntStream.range(0,str.length()/2).noneMatch(e->str.charAt(e)!=str.charAt(str.length()-e-1));
        if(ans)
        {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}

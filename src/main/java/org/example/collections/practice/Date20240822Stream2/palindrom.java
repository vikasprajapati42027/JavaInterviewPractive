package org.example.collections.practice.Date20240822Stream2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class palindrom {
    public static void main(String[] args) {
        int n=121;
        String s=String.valueOf(n);
        int len=String.valueOf(n).length();
      boolean ispalindrome=  IntStream.rangeClosed(0,n/2).anyMatch(e->s.charAt(e)==s.charAt(len-e-1));
        System.out.println(ispalindrome);
    }
}

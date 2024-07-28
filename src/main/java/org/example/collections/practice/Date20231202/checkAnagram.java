package org.example.collections.practice.Date20231202;

import java.util.Arrays;

public class checkAnagram {
    public  static  boolean isAnagram(String str1,String str2)
    {
        char[] ch1=str1.toCharArray();
        char[] ch2= str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
    public static void main(String[] args) {
        String str1="vikas";
        String str2="viksa";
        System.out.println(isAnagram(str1,str2));
    }
}

package org.example.collections.practice.Date20240605;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LongestString {
    private static final Logger log = LoggerFactory.getLogger(LongestString.class);

    public static String findLongestString(String[] str)
    {
        String logest=str[0];
        for(String s:str)
        {
            if(s.length()>logest.length())
            {
                logest=s;
            }
        }
        return logest;
    }
    public static void main(String[] args) {
        String[] strings = {"Hello", "World", "Java", "Programming", "Longest"};
        System.out.println("Longest string is: " + findLongestString(strings));
    }
}

package org.example.collections.practice.Date20240802;

public class LongestCommonPrefix {


    public static String longestCommonPrefix(String[] str)
    {
        String prefix=str[0];
        for(int i=0;i<str.length;i++)
        {
            if(str[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
            if(prefix.isEmpty())
                return "";
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"}; // Example array of strings
        String longestPrefix = longestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + longestPrefix);
    }
}

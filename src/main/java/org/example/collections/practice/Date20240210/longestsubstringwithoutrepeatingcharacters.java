package org.example.collections.practice.Date20240210;

import java.util.HashMap;
import java.util.Map;

public class longestsubstringwithoutrepeatingcharacters {
    public static String logest(String str)
    {
       Map<Character,Integer> map=new HashMap<>();
       String output="";
       for(int start=0,end=0;end<str.length();end++)
       {
           char charcurr=str.charAt(end);
           if(map.containsKey(charcurr))
           {
               start=Math.max(map.get(charcurr)+1,start);
           }
           if(output.length()>end-start+1)
           {
               output=str.substring(start,end+1);
           }
           map.put(charcurr,end);
       }
       return output;
    }
    public static String getUniqueCharacterSubstring(String input)
    {
        Map<Character,Integer> map=new HashMap<>();
        String output = "";
        for(int start=0,end=0;end<input.length();end++)
        {
            char charcurr=input.charAt(end);
            if(map.containsKey(charcurr))
            {
                start=Math.max(map.get(charcurr)+1,start);
            }
            if(output.length()<end-start+1)
            {
                output=input.substring(start,end+1);
            }
            map.put(charcurr,end);
        }
        return output;
    }
    public static void main(String[] args) {

        String input = "LongestSubstringFindOut";
        System.out.println(getUniqueCharacterSubstring(input));
    }


}

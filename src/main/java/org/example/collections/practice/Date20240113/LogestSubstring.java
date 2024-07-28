package org.example.collections.practice.Date20240113;

import java.util.HashMap;
import java.util.Map;

public class LogestSubstring {
    public static String logest(String str)
    {
      Map<Character,Integer> visited=new HashMap<>();
      String output="";
      for(int start=0,end=0;end<str.length();end++)
      {
          char ch=str.charAt(end);
          if(visited.containsKey(ch))
          {
              start=Math.max(visited.get(ch)+1,end);
          }
          if(output.length()<end-start+1)
          {
              output=str.substring(start,end+1);
          }
          visited.put(ch,end);
      }
      return output;


    }
    public static void main(String[] args) {
    String input = "LongestSubstringFindOut";
    System.out.println(logest(input).length());

    }
}

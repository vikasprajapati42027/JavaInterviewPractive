package org.example.collections.practice.Date20240802;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

      String str="vikasprajapati";
      Map<Character,Integer> map=new HashMap<>();
      char[] ch1=str.toCharArray();
      for(char ch:ch1)
      {
          if(map.containsKey(ch))
          {
              map.put(ch,map.get(ch)+1);
          }
          else {
              map.put(ch,1);
          }
      }
      Character charactor = null;
      int number=0;
      for(Map.Entry<Character,Integer> entry:map.entrySet())
      {
          if(entry.getValue()>number)
          {
              charactor=entry.getKey();
              number=entry.getValue();
          }

      }
        System.out.println(charactor+" "+number);
        
    }

}

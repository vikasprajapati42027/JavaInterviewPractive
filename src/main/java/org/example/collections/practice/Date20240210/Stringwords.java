package org.example.collections.practice.Date20240210;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Stringwords {
    public static void main(String[] args) {
        String str="This is type of the cpu  the you can change the number";
        String words[]=str.split("\\s");
        Map<String,Integer> map=new HashMap<>();
        for(String word:words)
        {
           if(map.containsKey(word))
           {
               map.put(word,map.get(word)+1);
           }
           else {
               map.put(word,1);
           }
        }
      //  Collections.sort(map.size()+map.get(0));
        for(Map.Entry set:map.entrySet())
        {

            System.out.println("words is -: "+set.getKey()+ " Count is -: "+set.getValue() );
        }
    }
}

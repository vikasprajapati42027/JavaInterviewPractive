package org.example.collections.practice.Date20240802;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedword {
    public static void mostrepeatedword(String str)
    {
        String[] words=str.split(" ");
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

        Integer count=0;
        String wordcount=null;
//        for(Map.Entry entry:map.entrySet())
//        {
//            if(entry.getValue()>count)
//            {
//                wordcount=entry.getKey();
//                count=entry.getValue();
//            }
//        }

    }
    public static void main(String[] args) {

    }
}

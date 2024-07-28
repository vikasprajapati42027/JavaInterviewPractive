package org.example.collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maptraverse {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("vikas",1);
        map.put("prajapati",2);
       // Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
        for(Map.Entry entry:map.entrySet())
        {
          System.out.println("Name : " +entry.getKey()+ " "+entry.getValue());
        }
    }
}

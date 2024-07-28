package org.example.collections.practice.Date20240506;

import sun.text.normalizer.UCharacter;

import java.util.HashMap;
import java.util.Map;



public class Occuranceofeachcharactor {

    public static void main(String[] args) {
        String str="vikas prajapati";
        Map<Character,Integer> map=new HashMap<>();
        char ch[]=str.toCharArray();
        for(Character ch1:ch)
        {
            if(map.containsKey(ch1))
            {
                map.put(ch1,map.get(ch1)+1);
            }else {
                map.put(ch1,1);
            }

        }

        for(Map.Entry entry: map.entrySet())
        {
            System.out.println("charactor "+entry.getKey()+" count "+entry.getValue());
        }
    }
}

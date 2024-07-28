package org.example.collections.practice.Date20240210;

import java.util.HashMap;
import java.util.Map;

public class norepeatcharactor {
    public static void main(String[] args) {
        String str="prajapati";
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        for(char ch:str.toCharArray())
        {
            if(map.get(ch)==1)
            {
                System.out.println(ch);
                break;
            }
        }
    }
}

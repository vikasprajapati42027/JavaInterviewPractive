package org.example.collections.Map;

import java.util.*;

public class countthecharacter {
    public static void main(String[] args) {
        String str="vikasprajapati";
        char[] ch=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char ch1:ch)
        {
            if(map.containsKey(ch1))
            {
                map.put(ch1,map.get(ch1)+1);
            }
            else {
                map.put(ch1,1);
            }

        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }


//        char[] ch1=str.toCharArray();
//         Map<Character,Integer> map=new HashMap<>();
//         for(Character ch:ch1)
//         {
//             if(map.containsKey(ch))
//             {
//                 map.put(ch,map.get(ch)+1);
//             }
//             else {
//                 map.put(ch,1);
//             }
//         }
//
//         for(Map.Entry entry:map.entrySet())
//         {
//             System.out.println("Character is : "+entry.getKey()+" Count "+ entry.getValue());
//         }
    }
}

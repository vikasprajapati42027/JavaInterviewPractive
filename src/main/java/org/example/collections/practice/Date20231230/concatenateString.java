package org.example.collections.practice.Date20231230;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class concatenateString {
    public static void main(String[] args) {

        String str="vikas prajapati vikas jay vikas";
        String words[]=str.split(" ");
        Map<String ,Integer> map=new HashMap<>();
        for(String  ch:words)
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }

        for(Map.Entry entry:map.entrySet())
        {
           
            System.out.println("Words is : "+entry.getKey()+ " count is : "+entry.getValue());
        }


    }
}

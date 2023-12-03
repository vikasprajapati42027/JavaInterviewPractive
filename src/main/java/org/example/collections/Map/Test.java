package org.example.collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        String str="vikasprajapati";

        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
//        char[] ch=str.toCharArray();
//        Map<Character,Integer> count=new HashMap<>();
//        for(char ch1:ch)
//        {
//            if(count.containsKey(ch1))
//            {
//                count.put(ch1,count.get(ch1)+1);
//            }
//            else {
//                count.put(ch1,1);
//            }
//        }
//        for(Map.Entry<Character,Integer> entry:count.entrySet())
//        {
//           // if(entry.getValue()>0)
//           if(entry.getValue()==1)
//            System.out.println("Character id "+entry.getKey() + " count "+ entry.getValue());
//        }
    }
}

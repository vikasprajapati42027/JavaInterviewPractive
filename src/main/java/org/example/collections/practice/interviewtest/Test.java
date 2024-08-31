package org.example.collections.practice.interviewtest;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void countWord(String[] str )
    {
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<str.length;i++)
        {
            if(map.containsKey(str[i]))
            {
                map.put(str[i],map.get(str[i])+1);
            }
            else {
                map.put(str[i],1);
            }
        }
        for(Map.Entry entry:map.entrySet())
        {
            System.out.println("Name is "+ entry.getKey()+ " count is : "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        String[] str={"vikas","jay","Rohan","pavan","vijay","vikas","jay"};
        countWord(str);
        for(int i=0;i<5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

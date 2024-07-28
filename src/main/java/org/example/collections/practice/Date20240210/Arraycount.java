package org.example.collections.practice.Date20240210;

import java.util.HashMap;
import java.util.Map;

public class Arraycount {
    public static void main(String[] args) {
        int arr[]={11,22,33,22,3,33,6,77};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        for(Map.Entry entry:map.entrySet())
        {
            System.out.println("Array is : "+ entry.getKey()+"  count  "+entry.getValue());
        }
    }
}

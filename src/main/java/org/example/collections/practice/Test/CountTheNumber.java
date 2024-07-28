package org.example.collections.practice.Test;

import java.util.HashMap;
import java.util.Map;

public class CountTheNumber {

    public static void main(String args[])
    {
       int arr[] = {10,5,20,6,10,15,20};

      //  String arr= "10,5,20,6,10,15,20";

       // String arr1[]=arr.split(",");
      //  Integer n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();

       for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put((arr[i]), map.get(arr[i])+1);}else {
                map.put((arr[i]),1);
            }
        }

        for(Map.Entry entry: map.entrySet())
        {

            System.out.println("Number of value : "+ entry.getKey()+ " count is : "+entry.getValue());
        }

    }
}

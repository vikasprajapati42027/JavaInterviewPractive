package org.example.collections.practice.Test;

import java.util.HashMap;
import java.util.Map;

public class CountNumberusingArray {

    public static int freq(int[] arr,int n)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        Map<Integer,Integer> map1=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map1.containsKey(arr[i]))
            {
                map1.put(arr[i],map1.get(arr[i])+1);
            }else{
                map1.put(arr[i],1);
            }
        }

        int sum = 0;
        for(Map.Entry<Integer,Integer> s:map.entrySet())
        {
            if(s.getValue()%2==0)
            {
                sum+=s.getKey()*s.getValue();
            }
        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//           // if (entry.getValue() % 2 == 0) {
//            if(entry.getValue()%2 ==0)
//                sum += entry.getKey() * entry.getValue();
//            }
//        }

        return sum;

//        for(Map.Entry s:map.entrySet())
//
//        {
//            if((s.getValue()) % 2 ==0)
//            {
//          System.out.println("Number is : "+s.getKey()+ " count is : "+s.getValue());
//                {
//        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 3 };
        System.out.println(freq(arr,arr.length));
    }
}

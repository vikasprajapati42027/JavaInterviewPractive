package org.example.collections.practice.Date20240802;

import java.util.*;

public class HashMaptoArrayList {
    public static void main(String[] args) {
        HashMap<String, String> studentPerformanceMap = new HashMap<String, String>();

        //Adding elements to HashMap

        studentPerformanceMap.put("John Kevin", "Average");

        studentPerformanceMap.put("Rakesh Sharma", "Good");

        studentPerformanceMap.put("Prachi D", "Very Good");

        studentPerformanceMap.put("Ivan Jose", "Very Bad");

        studentPerformanceMap.put("Smith Jacob", "Very Good");

        studentPerformanceMap.put("Anjali N", "Bad");

        Set<String> setkey=studentPerformanceMap.keySet();
        ArrayList<String> listkey=new ArrayList<>(setkey);
        for(String key:listkey)
        {
            System.out.println(key);
        }

        Collection<String> value=studentPerformanceMap.values();
        ArrayList<String> valuelist=new ArrayList<>(value);
        for(String value1:valuelist)
        {
            System.out.println(value1);
        }

    }
}

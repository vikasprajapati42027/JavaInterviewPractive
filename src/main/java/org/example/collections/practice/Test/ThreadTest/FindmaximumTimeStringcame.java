package org.example.collections.practice.Test.ThreadTest;


import java.util.HashMap;
import java.util.Map;

public class FindmaximumTimeStringcame {
    public static void main(String[] args) {
        // Given array of strings
        String[] strings = {"virat", "rohit", "rishabh", "rohit", "virat", "rohit"};

        // Create a HashMap to store the count of each string
        HashMap<String, Integer> stringCountMap = new HashMap<>();

        // Iterate through the array and count occurrences of each string
        for (String s : strings) {
            if (stringCountMap.containsKey(s)) {
                stringCountMap.put(s, stringCountMap.get(s) + 1);
            } else {
                stringCountMap.put(s, 1);
            }
        }

        // Find the string with the maximum count
        String maxString = null;
        int maxCount = 0;

        for(Map.Entry<String,Integer> entry:stringCountMap.entrySet())
        {
            if(entry.getValue()>maxCount)
            {
                maxString = entry.getKey();
                maxCount=entry.getValue();
            }
        }


//        for (Map.Entry<String, Integer> entry : stringCountMap.entrySet()) {
//            if (entry.getValue() > maxCount) {
//                maxString = entry.getKey();
//                maxCount = entry.getValue();
//            }
//        }

        // Output the result
        System.out.println("String with maximum occurrences: " + maxString);
        System.out.println("Number of occurrences: " + maxCount);
    }
}

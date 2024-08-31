package org.example.collections.practice.Date20240806Convert;

import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("vikas");
        hashSet.add("prajapati");
        hashSet.add("preeti");
        String[] array=new String[hashSet.size()];
        hashSet.toArray(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }

    }
}

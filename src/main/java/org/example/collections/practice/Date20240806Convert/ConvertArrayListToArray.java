package org.example.collections.practice.Date20240806Convert;

import java.util.ArrayList;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        Integer arr[]=new Integer[al.size()];
        for(Integer s:arr)
        {
            System.out.println(s);
        }
    }

}

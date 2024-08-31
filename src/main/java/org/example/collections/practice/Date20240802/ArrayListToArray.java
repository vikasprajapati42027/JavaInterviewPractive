package org.example.collections.practice.Date20240802;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("vikas");
        list.add("prajapati");
        list.add("jay");
        list.add("deep");

        String[] array=new String[list.size()];
        list.toArray(array);
        for(String i:array) {
            System.out.println(i);
        }
    }
}

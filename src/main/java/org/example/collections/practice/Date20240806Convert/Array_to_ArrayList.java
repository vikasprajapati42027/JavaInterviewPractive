package org.example.collections.practice.Date20240806Convert;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_to_ArrayList {
    public static void main(String[] args) {
        String[] arr=new String[]{"vikas","prajapati","preeti"};
        ArrayList<String> al=new ArrayList<>(Arrays.asList(arr));
        for(String str:al)
        {
            System.out.println(str);
        }
    }
}

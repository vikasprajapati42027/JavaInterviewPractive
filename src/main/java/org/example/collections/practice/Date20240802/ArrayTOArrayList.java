package org.example.collections.practice.Date20240802;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTOArrayList {
    public static void main(String[] args) {
        String[] array=new String[]{"vikas","prajapati","kumar"};
        ArrayList<String> list=new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
    }
}

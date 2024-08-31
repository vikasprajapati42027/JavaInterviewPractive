package org.example.collections.practice.Date20240821Stream;
import org.apache.poi.sl.draw.geom.GuideIf;

import  java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class MaximuNumber {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Optional max= myList.stream().max(Integer::compare);
        System.out.println(max);


        Optional min=myList.stream().min(Integer::compareTo);
        System.out.println(min);
    }
}

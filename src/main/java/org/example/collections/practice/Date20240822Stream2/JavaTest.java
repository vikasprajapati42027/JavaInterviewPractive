package org.example.collections.practice.Date20240822Stream2;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("vikas","Indore");
        map.put("aakash","Neemuch");
        map.put("preeti","Indore");
    // Map<String,String> res=   map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey,Collectors.joining(","))));

        Map<String,String> res=map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey,Collectors.joining(","))));

        res.forEach((k,v)-> System.out.println(k+"="+v));


    }
}

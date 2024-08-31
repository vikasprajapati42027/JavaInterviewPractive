package org.example.collections.practice.Date20240821Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindCharacterpkey {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();

        map.put("madhya  pradesh","bhopal");
        map.put("gujrat","gandinagar");
        map.put("rajisthan","jaipur");

        List<String> list=new ArrayList<>();














        list = map.entrySet().stream().filter(e->e.getValue().contains("p")).map(e->e.getKey()).collect(Collectors.toList());



       // list= map.entrySet().stream().filter(e->e.getValue().contains("p")).map(e->e.getKey()+" "+ e.getValue()).collect(Collectors.toList());

        System.out.println(list);

        for(Map.Entry<String,String> str:map.entrySet())
        {
            if(str.getValue().contains("p"))
            {
                System.out.println(str.getKey());
            }
        }

    }
}

package org.example.collections.practice.Date20240825Stream3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapFuntion {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("one", "vikas");
        map.put("two","prajapati");
        map.put("three","kumar");
        //map.remove("one");
        System.out.println(map);
      // Map<String,Integer> map1= map.entrySet().stream().map(e->e.getKey().contains("o")).collect(Collectors.toList()).stream().map(e->e.);

       map.entrySet().stream().filter(e->e.getValue().contains("m")).forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));


        Map<String,Integer> map1 =new HashMap<>();
                map1.put("one", 1);
                map1.put( "two", 2);
                map1.put( "three", 3);

                map1.entrySet().stream().map(e->e.getKey()).forEach(System.out::println);

                Map<String,Integer> filterMap=map1.entrySet().stream().filter(e->e.getKey().startsWith("t")).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(filterMap);

        Map<String, Integer> transformedMap =map1.entrySet().stream().collect(Collectors.toMap(entry->entry.getKey()+"tr ",Map.Entry::getValue));
        System.out.println(transformedMap);

        //Map<Boolean, List<Map<String, Integer>>> partitionedMap =map1.entrySet().stream().collect(Collectors.partitioningBy(e->e.getKey().startsWith("t")));

       // System.out.println(partitionedMap);

        Map<String, Integer> map3 = new HashMap<>();
                map3.put("one", 1);
                        map3.put( "two", 2);
        Map<String, Integer> map4 = new HashMap<>();
        map4.put("three", 3);
        map4.put( "four", 4);

      //  Map<String,Integer> concatmap=map3.entrySet().stream();
    }
}

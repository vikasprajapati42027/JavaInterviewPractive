package org.example.collections.practice.Date20240821Stream;
import java.awt.image.ColorModel;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findCountOfCharacter {
    public static void main(String[] args) {
        String s = "string data to count each character";


     Map<String,Long> map2=Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
             .filter(e->e.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println(map2);










        Map<String,Long> count=Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(str->str,Collectors.counting()));
        System.out.println(count);



        Map<String,Long> map= Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}

package org.example.collections.practice.Date20240821Stream;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LowerCaseTest {
    public static void main(String[] args) {
        String str="Vikas Prajapati I'm Software Engineer";
        Arrays.stream(str.split("")).map(e->e.toLowerCase()).forEach(System.out::print);

        System.out.println("####################################################");
        String str1="vikas Prajapati";
        Arrays.stream(str1.split("")).map(e->e.toUpperCase()).forEach(System.out::print);


     //  Map<String,Long> map=str.chars().map(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}

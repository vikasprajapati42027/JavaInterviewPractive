package org.example.collections.practice.Date20240825Stream3;
import org.example.collections.youtubepractice.Funtion;

import java.util.*;
import java.util.function.Function;

public class UppercaseExampleFuntion {
    public static void main(String[] args) {
        Function<String,String> uppercase= (str)->str.toUpperCase();

        String res=uppercase.apply("vikas");
        System.out.println(res);
    }
}

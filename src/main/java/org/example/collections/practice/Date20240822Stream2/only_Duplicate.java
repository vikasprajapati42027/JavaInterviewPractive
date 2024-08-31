package org.example.collections.practice.Date20240822Stream2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class only_Duplicate {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("abc", "def", "xyz", "mno", "pqr","def", "xyz", "stu");
        Set<String> set=new HashSet<>();
        list1.stream().filter(e->!set.add(e)).forEach(System.out::println);
    }
}

package org.example.collections.practice.ComparableAND_ComparatorSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparatorS {

    public static void main(String[] args) {
        List<StudentComparator> std=new ArrayList<>();
        std.add(new StudentComparator("vikas",101,27));
        std.add(new StudentComparator("aakash",103,26));
        std.add(new StudentComparator("prajapati",102,22));
        System.out.println(std);
        Collections.sort(std,new AgeComparator());
        System.out.println(std);
    }
}

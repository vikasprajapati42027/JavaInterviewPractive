package org.example.collections.practice.ComparableAND_ComparatorSort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        List<StudentComparable> std=new ArrayList<>();
        std.add(new StudentComparable("vikas",101,27));
        std.add(new StudentComparable("aakash",103,26));
        std.add(new StudentComparable("prajapati",102,22));
        System.out.println(std);
        Collections.sort(std);
        System.out.println(std);

    }
}

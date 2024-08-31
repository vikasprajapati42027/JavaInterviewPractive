package org.example.collections.practice.Date20240824Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class unmodifiedList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("vikas");
        list.add("prajapati");

        Collections.unmodifiableList(list);

    }
}

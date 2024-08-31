package org.example.collections.practice.Date20240802;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();

        listWithDuplicateElements.add("JAVA");

        listWithDuplicateElements.add("J2EE");

        listWithDuplicateElements.add("JSP");

        listWithDuplicateElements.add("SERVLETS");

        listWithDuplicateElements.add("JAVA");

        listWithDuplicateElements.add("STRUTS");

        listWithDuplicateElements.add("JSP");

        Set<String> set=new HashSet<>();

        for(String str:listWithDuplicateElements)
        {
            set.add(str);
        }

        for(String str:set)
        {
            System.out.println(str);
        }
    }
}

package org.example.collections.arrayList;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("satish");
        list.add("vikas");
        list.add("aakash");
        list.add("prajapati");
        list.add("vikas");
        Collections.sort(list,Collections.reverseOrder());
       // System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        Set<String> set=new LinkedHashSet<>(list);
       // System.out.println(set);

        List<String> list1=new ArrayList<>();
        list1.add("satish");
        list1.add("vikas");
        list1.add("aakash");
        list1.add("prajapati");
        list1.add("vikas1");

        if(list.equals(list1))
        {
            System.out.println("yes");

        }
        else {
            System.out.println("No");
        }
    }
}

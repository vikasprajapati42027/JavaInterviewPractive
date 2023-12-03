package org.example.collections.arrayList;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.DoubleToIntFunction;

public class arrraylist {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("vikas");
        list.add("pravin");
        list.add("bala");
       // System.out.println(list);
        Iterator it=list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        Collections.sort(list);
        for(String s:list)
        {
            System.out.println(s);
        }

        for(int i=0;i<list.size();i++)
        {
            System.out.println("Name is : "+list.get(i));
        }
        System.out.println("for each");
        list.forEach(a-> System.out.println(a));
    }

}

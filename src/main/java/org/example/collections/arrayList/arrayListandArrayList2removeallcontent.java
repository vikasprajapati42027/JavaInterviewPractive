package org.example.collections.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arrayListandArrayList2removeallcontent {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("vikas");
        al.add("prakapati");
        ArrayList<String> al1=new ArrayList<>();
        al1.add("vikas");
        al1.add("vikas1");
        al1.add("prakapati");

         al1.removeAll(al);
         System.out.println(al1);

    }
}

package org.example.collections.practice.Date20240821Stream;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

//        Integer n=myList.stream().findFirst().get();
//        System.out.println(n);

        //myList.stream().findFirst().ifPresent(System.out::println);



        myList.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
        myList.stream().filter(n->n.toString().startsWith("1")).forEach(System.out::println);

    }
}

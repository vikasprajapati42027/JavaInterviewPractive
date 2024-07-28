package org.example.collections.practice.StreamDate20240619;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("vikas", "aakash", "satish", "jay", "peter","vikas");
//        //  list.stream().forEach(System.out::println);
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        //list1.stream().filter(a-> a%2==0).forEach(System.out::println);}
//      //  list.stream().distinct().forEach(System.out::println);
//       // list.stream().
//        int[] arr={1,2,3,4,5,6,7,8,99,34,534,23,545,6743,245,4,5,3,2};
//        //List<[]> list6=Arrays.asList(arr);
//        //ArrayList<Integer> list2=Arrays.asList(Arrays.stream(arr).distinct());
//        //Arrays.stream(arr).distinct().forEach(e->System.out.print(e +" "));
//
//        List<String> list4=new ArrayList<>();
//        list4.add("vikas");
//        list4.add("aakash");
//        list4.add("narayan");
//        // list4.stream().sorted().forEach(System.out::println);
//         list4.stream().filter(s->s.toLowerCase().contains("aakash")).forEach(System.out::println);

       // List<String> list5=Arrays.asList(list4);
        //  System.out.println(list4);
        List<String> stringList = new ArrayList<String>();

        stringList.add("Java Guides");
        stringList.add("Python Guides");
        stringList.add("C Guides");

        Stream<String> stream= stringList.stream();
        boolean anymathc= stream.anyMatch(value -> value.startsWith("java"));
        System.out.println(anymathc);

        boolean allmatch=stream.allMatch(v -> v.contains("Guides"));
        System.out.println(allmatch);
    }
}

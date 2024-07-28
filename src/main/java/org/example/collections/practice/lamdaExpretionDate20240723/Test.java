package org.example.collections.practice.lamdaExpretionDate20240723;

import org.example.collections.practice.Date20231202.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,5,5,66,33,22,1,3,44,55);

        List<employee> employees=Stream.of(new employee(1,"vikas","dev",345231),
                new employee(2,"aakash","Devops",536243),
                new employee(3,"satish","Dev",435643),
                new employee(4,"vikas1","dev",545231),
                new employee(5,"aakash1","Devops",636243),
                new employee(6,"satish1","Dev",935643)
                ).collect(Collectors.toList());

       Map<String, List<employee>> list4=employees.stream().collect(Collectors.groupingBy(employee::getDept));
        System.out.println(list4);


        List<User> user= Stream.of(new User("vikas","2345242423",Arrays.asList("vikas@gmail.com","aakash@gmail.com")),
                new User("vikas1","9345242423",Arrays.asList("vikasP@gmail.com","aakashP@gmail.com"))).collect(Collectors.toList());
        //list.stream().filter(t-> t>4).sorted().forEach(e-> System.out.println(e));
       // list.stream().filter(t-> t>4).sorted().forEach(Test::printElement);
        List<String> list1=user.stream().map(User::getNumber).collect(Collectors.toList());
        //System.out.println(list1);

        List<List<String>> list2=user.stream().map(User::getEmail).collect(Collectors.toList());
//System.out.println(list2);

        List<String> list3=user.stream().flatMap(u->u.getEmail().stream()).collect(Collectors.toList());
       // System.out.println(list3);


        String input="prajapati";
        Map<String,Long> count=Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(count);


        String input1="vikasp";
        Map<String,Long> countchar=Arrays.stream(input1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countchar);
    }
    public static void printElement(int i)
    {
        System.out.println(i);
    }






}

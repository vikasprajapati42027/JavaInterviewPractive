package org.example.collections.practice.Date20240825Stream3;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Addaprefix {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> ans=words.stream().map(s->"fruit: "+s).collect(Collectors.toList());
        System.out.println(ans);

        List<Integer> ans1=words.stream().map(s->" "+s).map(String::length).collect(Collectors.toList());
        System.out.println(ans1);
        List<String> initials = words.stream().map(s -> s.toUpperCase().charAt(0)+s.substring(1)).collect(Collectors.toList());
        System.out.println(initials);
       // Map<String,Integer> map=words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().map(e->e.getKey()).;

        List<String> words1 = Arrays.asList(" apple ", " banana ", " cherry ");
        List<String> trimmed = words1.stream().map(String::trim).collect(Collectors.toList());
        System.out.println(trimmed);


        List<String> reversed = words.stream().map(s->(new StringBuilder(s).reverse().toString())).collect(Collectors.toList());
        System.out.println(reversed);
// Use map() to calculate the square root of each element in a list of doubles.
        List<Double> numbers = Arrays.asList(4.0, 9.0, 16.0);
        List<Double> ans2=numbers.stream().map(Math::sqrt).collect(Collectors.toList());
        System.out.println(ans2);

//Convert a list of integers to a list of their binary string representations using map().
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<String> binaryStrings = numbers1.stream().map(Integer::toBinaryString).collect(Collectors.toList());
        System.out.println(binaryStrings);

        Random random=new Random();
        random.ints().limit(5).forEach(System.out::println);

        //hashcode
        List<String> words3 = Arrays.asList("apple", "banana", "cherry");
        List<Integer> hashCodes = words3.stream().map(String::hashCode).collect(Collectors.toList());
        System.out.println(hashCodes);

        //contain is digite
        List<String> words4 = Arrays.asList("apple1", "banana", "cherry3");
        List<Boolean> containsDigit = words4.stream().map(s->s.matches(".*\\d*.")).collect(Collectors.toList());
        System.out.println(containsDigit);

        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4);
        List<String> prefixedNumbers = numbers3.stream().map(s->(s%2==0?"even":"odd")).collect(Collectors.toList());
        System.out.println(prefixedNumbers);

        List<String> list = Arrays.asList("vikas", "prajapati");
        list.stream().map(s->s+" "+s.length()).forEach(System.out::println);
    }
}

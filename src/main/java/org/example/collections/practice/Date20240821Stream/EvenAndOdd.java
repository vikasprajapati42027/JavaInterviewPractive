package org.example.collections.practice.Date20240821Stream;
import java.util.List;
import java.util.Arrays;
public class EvenAndOdd {
    public static void main(String[] args) {


        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        listOfIntegers.stream().filter(e->e%2==0).forEach(System.out::println);
    }
}

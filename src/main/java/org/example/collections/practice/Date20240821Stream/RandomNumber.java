package org.example.collections.practice.Date20240821Stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RandomNumber {
    public static void main(String[] args) {
        Random random=new Random();

        Stream.generate(random::nextInt).limit(10).forEach(System.out::println);



    }
}

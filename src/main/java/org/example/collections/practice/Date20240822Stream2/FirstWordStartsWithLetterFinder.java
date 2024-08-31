package org.example.collections.practice.Date20240822Stream2;

import java.util.Arrays;
import java.util.List;

public class FirstWordStartsWithLetterFinder {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape");
        char targetLetter = 'o';

        words.stream().filter(e->e.charAt(0)==targetLetter).forEach(System.out::println);

        String[] str={"apple", "banana", "orange", "grape","bbb"};
        Arrays.stream(str).filter(e->e.contains("orange")).forEach(System.out::println);
    }
}

package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findAnyElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> any = numbers.stream().findAny();
        System.out.println(any);
    }
}

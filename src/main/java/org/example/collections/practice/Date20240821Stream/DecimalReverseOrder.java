package org.example.collections.practice.Date20240821Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//How do you sort the given list of decimals in reverse order?
public class DecimalReverseOrder {
    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        List<Double> ans=decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(ans);
    }
}

package org.example.collections.practice.Date20240822Stream2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class DigitSumCalculator {
    public static void main(String[] args) {
        int n=1234;
      Stream num= Arrays.stream(String.valueOf(n).split("")).map(Integer::parseInt);


    }
}

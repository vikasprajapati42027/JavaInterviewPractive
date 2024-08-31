package org.example.collections.practice.Date20240822Stream2;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindTheSUmOfDigite {
    public static void main(String[] args) {
        int n=12345;

       int sum= String.valueOf(n).chars().map(Character::getNumericValue).sum();
        System.out.println(sum);
    }
}

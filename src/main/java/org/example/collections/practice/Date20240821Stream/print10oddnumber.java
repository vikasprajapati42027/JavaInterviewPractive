package org.example.collections.practice.Date20240821Stream;

import java.sql.SQLOutput;
import java.util.stream.IntStream;

public class print10oddnumber {
    public static void main(String[] args) {

        IntStream.range(1,20).filter(e->e%2!=0).forEach(System.out::println);
    }
}

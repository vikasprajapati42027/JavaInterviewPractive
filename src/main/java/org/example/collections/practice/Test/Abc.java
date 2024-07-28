package org.example.collections.practice.Test;

public class Abc {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Abc abc = new Abc();
        abc.add(1, 2);
        abc.add(1, 2, 3);
    }
}

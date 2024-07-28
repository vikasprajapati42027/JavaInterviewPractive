package org.example.collections.practice.Test;

public class ABC {

    void print1(Integer a) {
        System.out.println(a+"");
    }

    void print1(String a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        ABC abc = new ABC();
        abc.print1(1);
        abc.print1("String");
        abc.print1("null");
    }
}

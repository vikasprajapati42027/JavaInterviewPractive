package org.example.collections.practice.Test;

public class Stringcompaire {
    public static void main(String[] args) {
        String str1 = "Ramesh";
        String str2 = "Ramesh";

        System.out.println(str1.equals(str2));// true
        System.out.println(str1==str2);



        String s1 = new String("Ramesh");
        String s2 = new String("Ramesh");

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1==s2); //false
    }
}


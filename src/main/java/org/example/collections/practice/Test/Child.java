package org.example.collections.practice.Test;

public class Child extends Parent{
    public void method() {
        System.out.println("Child class method is calling ");
    }

    public static void main(String[] args) {
        Parent child = new Child();
        child.method();
        String a = "Hello";
        String b = "World";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a+" B" +b);
    }
}

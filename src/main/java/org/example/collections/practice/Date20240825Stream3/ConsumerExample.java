package org.example.collections.practice.Date20240825Stream3;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> ans=(str)-> System.out.println(str);

        ans.accept("hello vikas");


    }
}

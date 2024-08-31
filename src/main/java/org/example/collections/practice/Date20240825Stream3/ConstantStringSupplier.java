package org.example.collections.practice.Date20240825Stream3;

import java.util.function.Supplier;

public class ConstantStringSupplier {
    public static void main(String[] args) {
        Supplier<String> stringSupplier=()->"vikas";
        String ans= stringSupplier.get();
        System.out.println(ans);
    }
}

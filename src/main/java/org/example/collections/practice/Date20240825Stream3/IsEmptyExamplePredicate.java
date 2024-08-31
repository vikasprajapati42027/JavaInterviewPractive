package org.example.collections.practice.Date20240825Stream3;

import java.util.function.Predicate;

public class IsEmptyExamplePredicate {
    public static void main(String[] args) {
        Predicate<String> isempty=String::isEmpty;
        boolean ans= isempty.test("vikas");
        System.out.println(ans);
    }
}

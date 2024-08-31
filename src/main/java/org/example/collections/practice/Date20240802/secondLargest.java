package org.example.collections.practice.Date20240802;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class secondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 6, 6, 7, 2);
        Optional<Integer> ans=numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(ans);
        ans.isPresent();
    }
}

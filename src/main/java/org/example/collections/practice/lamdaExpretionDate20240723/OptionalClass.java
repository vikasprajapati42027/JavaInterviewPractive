package org.example.collections.practice.lamdaExpretionDate20240723;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        String[] str=new String[6];
        Optional<String> check=Optional.ofNullable(str[2]);

        if(check.isPresent())
        {
            String lower=str[2].toLowerCase();
            System.out.println(lower);
        }else {
            System.out.println("Value not present");
        }
    }
}

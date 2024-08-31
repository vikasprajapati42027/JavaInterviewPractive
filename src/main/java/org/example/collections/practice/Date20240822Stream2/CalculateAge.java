package org.example.collections.practice.Date20240822Stream2;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {

    public static void main(String[] args) {
        LocalDate birthdate=LocalDate.parse("1996-08-23");
        LocalDate currentdate= LocalDate.now();

        Period age=Period.between(birthdate,currentdate);
        System.out.println(age);


    }
}

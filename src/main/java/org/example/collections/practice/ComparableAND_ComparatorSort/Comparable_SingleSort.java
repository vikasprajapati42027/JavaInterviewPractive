package org.example.collections.practice.ComparableAND_ComparatorSort;

import java.util.Arrays;

//public class Comparable_SingleSort {
//
//}
// Define a class that implements Comparable interface
class Comparable_SingleSort implements Comparable<Comparable_SingleSort> {
    private String name;
    private int age;

    // Constructor
    public Comparable_SingleSort(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implement the compareTo() method
    @Override
    public int compareTo(Comparable_SingleSort other) {
        // Compare students based on their age
        return Integer.compare(this.age, other.age);
    }

    // toString() method to print Student details
    @Override
    public String toString() {
        return "Comparable_SingleSort [name=" + name + ", age=" + age + "]";
    }
}

//public int compareTo(comparable_Singlesort other)
//{
//    return Intergare.compare(this.age)-other.age;
//}
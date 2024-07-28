package org.example.collections.practice.ComparableAND_ComparatorSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Define a class representing a Person
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
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

    // toString() method to print Person details
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}



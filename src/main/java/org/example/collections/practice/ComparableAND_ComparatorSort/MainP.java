package org.example.collections.practice.ComparableAND_ComparatorSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainP {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));

        // Sort the list of people by name using a Comparator
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        // Print the sorted list
        System.out.println("People sorted by name:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sort the list of people by age using a Comparator
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });
//
//        Collections.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person person, Person t1) {
//                return person.getName().compareTo(t1.getName());
//            }
//        });

        //Collections.sort(Person,new Comparator<Person>(){
        // override();
        //public int compare(Person p1,Person p2){ p1 .getAge- this.p2}
        // };

        // Print the sorted list
        System.out.println("\nPeople sorted by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

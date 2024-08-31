package org.example.collections.practice.Date20240823Stream3;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
        empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
        //Group the Employees by city.
        Map<String, List<Employee>> empByCity=empList.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println(empByCity);

        //Group the Employees by age.
        Map<Integer,List<Employee>> age=empList.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(age);

        // Find the count of male and female employees present in the organization.
        Map<String,Long> malefemale=empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(malefemale);

        //Print the names of all departments in the organization.
        empList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);

         //Print employee details whose age is greater than 28.
        empList.stream().filter(e->e.getAge()>28).forEach(System.out::println);
         //Find maximum age of employee.
       int res= empList.stream().map(Employee::getAge).max(Integer::compareTo).get();
        System.out.println(res);

        //Print Average age of Male and Female Employees.
        Map<String,Double> map=empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(map);

        // Print the number of employees in each department.
        Map<String,Long> ans1=empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
        System.out.println(ans1);

    }


}

package org.example.collections.practice.ComparableAND_ComparatorSort;

public class StudentComparator {
    private String name;
    private int rollno;
    private int age;

    public StudentComparator(String name, int rollno, int age) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentComparable{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", age=" + age +
                '}';
    }
}

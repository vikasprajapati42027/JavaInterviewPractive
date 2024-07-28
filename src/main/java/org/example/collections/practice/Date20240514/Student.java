package org.example.collections.practice.Date20240514;

public class Student {
    int id1;
    String name;
    String address;

    public Student(int id1, String name, String address) {
        this.id1 = id1;
        this.name = name;
        this.address = address;
    }

//    public String getId1() {
//        return id1;
//    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id1=" + id1 +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

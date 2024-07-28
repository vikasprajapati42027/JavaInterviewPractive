package org.example.collections.practice.Date20240210;

public class B {
    A a;
    String Address;

    public B(A a, String address) {
        this.a = a;
        Address = address;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                ", Address='" + Address + '\'' +
                '}';
    }
}

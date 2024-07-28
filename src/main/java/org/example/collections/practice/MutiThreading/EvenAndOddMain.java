package org.example.collections.practice.MutiThreading;

public class EvenAndOddMain {
    public static void main(String[] args) {
        EvenAndOddNumber1 eo1=new EvenAndOddNumber1();
        EvenAndOddNumber2 eo2=new EvenAndOddNumber2();
        Thread t1=new Thread(eo1);
        Thread t2=new Thread(eo2);
        t1.start();
        t2.start();

    }
}

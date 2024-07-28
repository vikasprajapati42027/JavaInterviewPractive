package org.example.collections.practice.MutiThreading.M20240604.staticsynchronized;

public class Customer {
    public static void main(String[] args) {
        Bank obj=new Bank(5000);
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);

        t1.setName("vikas");
        t2.setName("prajapati");

        t1.start();
        t2.start();

        Bank obj1=new Bank(5000);
        Thread t3=new Thread(obj1);
        Thread t4=new Thread(obj1);

        t3.setName("vikas-1");
        t4.setName("prajapati-1");

        t3.start();
        t4.start();
    }
}

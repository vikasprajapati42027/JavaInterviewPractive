package org.example.collections.practice.MutiThreading.M20240604.synchronization;

public class tableMain {
    public static void main(String[] args) {


    Table obj=new Table();
    tableThread1 t1=new tableThread1(obj);
    tableThread2 t2=new tableThread2(obj);

    t1.start();
    t2.start();
    }
}

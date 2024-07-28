package org.example.collections.practice.MutiThreading.M20240604;

public class yieldMainThread {
    public static void main(String[] args) {
        yieldThread1 t1=new yieldThread1();
        yieldThread2 t2=new yieldThread2();
       // sleepThread t3=new sleepThread();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();

       // t1.join();
        t2.start();
    }
}

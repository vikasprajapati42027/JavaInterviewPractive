package org.example.collections.practice.MutiThreading.M20240604.synchronization;

public class tableThread1 extends Thread{
    Table t;
    tableThread1(Table t)
    {
        this.t=t;
    }
    @Override
    public synchronized void run() {


        t.printtable(5);
    }
}

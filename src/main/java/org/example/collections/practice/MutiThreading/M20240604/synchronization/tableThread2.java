package org.example.collections.practice.MutiThreading.M20240604.synchronization;

public class tableThread2 extends Thread{

    Table t;

    tableThread2(Table t)
    {
        this.t=t;
    }

    @Override
    public void run() {
        t.printtable(7);
    }
}

package org.example.collections.practice.MutiThreading.M20240604.synchronizedblock;

public class ourThread extends Thread{
     msg m;
     String name;
     ourThread(msg m, String name)
     {
         this.m=m;
         this.name=name;
     }

    @Override
    public void run() {
        m.show(name);
    }
}

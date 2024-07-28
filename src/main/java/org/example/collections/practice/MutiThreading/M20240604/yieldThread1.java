package org.example.collections.practice.MutiThreading.M20240604;



public class yieldThread1 extends Thread{
    public void run()
    {
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(n);
            try {
                Thread.sleep(1000);
                Thread.yield();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}

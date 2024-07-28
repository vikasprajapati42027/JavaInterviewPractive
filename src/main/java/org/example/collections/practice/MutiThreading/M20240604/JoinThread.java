package org.example.collections.practice.MutiThreading.M20240604;



//package org.example.collections.practice.MutiThreading;

public class JoinThread  extends Thread{
    public void run()
    {
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        sleepThread t1=new sleepThread();
        sleepThread t2=new sleepThread();
        sleepThread t3=new sleepThread();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t1.join();
        t2.start();
    }
}

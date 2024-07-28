package org.example.collections.practice.MutiThreading.M20240604;

public class interruptedException  extends Thread{
    public void run()
    {
       // String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        sleepThread t1=new sleepThread();

  ;
        t1.start();

    }
}

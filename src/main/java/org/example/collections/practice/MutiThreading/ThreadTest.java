package org.example.collections.practice.MutiThreading;

import org.apache.poi.ss.formula.functions.T;

public class ThreadTest  extends  Thread{

    @Override
    public void run() {
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println(Thread.currentThread().getName() + "  NUmber is : - "+i);
                Thread.sleep(1000);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadTest t1=new ThreadTest();
        t1.start();
    }
}

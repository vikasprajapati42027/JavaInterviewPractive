package org.example.collections.practice.MutiThreading;

import org.apache.poi.ss.formula.functions.T;

public class RunnableTest  implements  Runnable{

    @Override
    public void run() {
        try {
            for(int i=0;i<5;i++)
            {
                System.out.println(Thread.currentThread().getName()+ " Number is:- "+i);
                Thread.sleep(1000);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RunnableTest rt=new RunnableTest();
        Thread t1=new Thread(rt);
        t1.start();
    }
}

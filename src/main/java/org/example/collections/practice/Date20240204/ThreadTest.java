package org.example.collections.practice.Date20240204;


public class ThreadTest implements Runnable{

    @Override
    public void run() {
        try{
            for(int i=0;i<5;i++)
            {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" "+"Number is : "+i);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadTest threadTest=new ThreadTest();
        Thread t=new Thread(threadTest);
        t.start();
    }
}

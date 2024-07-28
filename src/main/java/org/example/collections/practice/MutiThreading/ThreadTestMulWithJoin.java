package org.example.collections.practice.MutiThreading;

public class ThreadTestMulWithJoin implements  Runnable{
    @Override
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " Number is -: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadTestMulWithJoin ttm=new ThreadTestMulWithJoin();
        Thread t1=new Thread(ttm);
        t1.start();
        t1.join();

        Thread t2=new Thread(ttm);
        t2.start();


        Thread t3=new Thread(ttm);
        t3.start();

    }
}

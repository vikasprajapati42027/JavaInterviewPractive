package org.example.collections.practice.MutiThreading;

public class EvenAndOddNumber1 implements Runnable {
    int c = 1;
    static int NUM;

    @Override
     public void run() {


        synchronized (this) {
            for (int i = 1; i <= 20; i++) {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
                notify();
            }
        }
    }
}






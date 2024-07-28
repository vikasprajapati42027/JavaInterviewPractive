package org.example.collections.practice.MutiThreading;

import jdk.nashorn.internal.runtime.ECMAException;

public class DeadLock {
    public static void
    main(String args[])
    {
    final String r1 = "eduraka";
    final String r2 = "java";
    Thread t1 = new Thread() {
        public void run() {

            synchronized (r1) {
                System.out.println("Thread 1: Locked r1");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            synchronized (r2) {
                System.out.println("Thread 1: Locked r2");
            }
        }
        };


        Thread t2 = new Thread() {
            public void run() {
                synchronized (r1) {
                    System.out.println("Thread 2: Locked r1");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception exception
                    ) {
                        exception.printStackTrace();
                    }
                }
                synchronized(r2)
                {
                    System.out.println("Thread 2: Locked r2");
                }
            }

    };

            t1.start();
            t2.start();
        }
}

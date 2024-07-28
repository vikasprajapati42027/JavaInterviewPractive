package org.example.collections.practice.MutiThreading.M20240604.synchronization;

public class Bus implements Runnable{

    int available=1,passanger;
    Bus(int passanger)
    {
        this.passanger=passanger;
    }

    @Override
    public synchronized void run() {
      if(available>=passanger)
      {
          String name=Thread.currentThread().getName();
          System.out.println(name+" reserve seat...!");
          available=available-passanger;
      }
      else {
          System.out.println("seat not available");
      }
    }

    public static void main(String[] args) {
        Bus r=new Bus(1);
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);


        t1.setName("Raju");
        t2.setName("aakash");
        t3.setName("vikas");

        t1.start();
        t2.start();
        t3.start();
    }
}

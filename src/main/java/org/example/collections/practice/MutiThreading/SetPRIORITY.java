package org.example.collections.practice.MutiThreading;

public class SetPRIORITY implements  Runnable{

    @Override
    public void run() {
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println(Thread.currentThread().getName()+" Number is -: "+i);
                Thread.sleep(1000);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SetPRIORITY sp=new SetPRIORITY();
        Thread t1=new Thread(sp);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
      //  t1.join();

        Thread t2=new Thread(sp);
        t2.setPriority(Thread.MIN_PRIORITY);
     //   t2.join();

        Thread t3=new Thread(sp);
        t3.setPriority(Thread.NORM_PRIORITY);
    }
}

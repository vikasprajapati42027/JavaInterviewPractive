package org.example.collections.practice.MutiThreading.M20240604.synchronizedblock;

public class msgMain {
    public static void main(String[] args) {
        msg smsg=new msg();
        ourThread t1=new ourThread(smsg,"vikas");
        ourThread t2=new ourThread(smsg,"prajapati");
        t1.start();
        t2.start();
    }
}

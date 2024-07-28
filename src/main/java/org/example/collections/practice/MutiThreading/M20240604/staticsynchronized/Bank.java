package org.example.collections.practice.MutiThreading.M20240604.staticsynchronized;

public class Bank extends Thread{
    static int bal = 5000;
    static int withdraw;

    public Bank(int withdraw) {
        this.withdraw = withdraw;
    }


    public  static synchronized void Withdraw() {
        String name=Thread.currentThread().getName();
        if(withdraw<=bal)
        {
            System.out.println(name+" withdraw money");
            bal=bal-withdraw;
        }else {
            System.out.println("Insufficent balance");
        }
    }

    @Override
    public void run() {
        Withdraw();
    }
}

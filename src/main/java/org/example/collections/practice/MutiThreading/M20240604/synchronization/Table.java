package org.example.collections.practice.MutiThreading.M20240604.synchronization;

public class Table {

    public void printtable(int n)
    {
        for(int i=1;i<=10;i++) {
            System.out.println(n * i);
        }
    }
}

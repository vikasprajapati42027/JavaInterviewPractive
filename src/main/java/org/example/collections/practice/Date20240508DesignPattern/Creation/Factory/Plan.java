package org.example.collections.practice.Date20240508DesignPattern.Creation.Factory;

import java.io.*;
abstract class Plan{
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}//end of Plan class.

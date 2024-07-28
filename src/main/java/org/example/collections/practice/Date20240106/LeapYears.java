package org.example.collections.practice.Date20240106;

public class LeapYears {
    public static void main(String[] args) {
        int y=2020;
        if(y%400==0 && y%4==0|| y%100==0)
        {
            System.out.println("leapyear");
        }
    }
}

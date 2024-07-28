package org.example.collections.practice.Date20231202;

public class leapYears {
    public static int leapYear(int y)
    {
        if(y%400 ==0 || y%100!=0 && y%4==0)
        {
            return 1;
        }
        else {
            return 0;
        }


    }
    public static void main(String[] args) {
        int y=2020;
        System.out.println(leapYear(y));
    }
}

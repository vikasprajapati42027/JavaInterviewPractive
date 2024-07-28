package org.example.collections.practice.Date20240204;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random r=new Random();
        System.out.println("Enter the range");
        for(int i=0;i<10;i++)
        {
            System.out.println(r.nextInt(700));
        }
    }
}

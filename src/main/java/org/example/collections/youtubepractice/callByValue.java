package org.example.collections.youtubepractice;

public class callByValue {
    int b;


    public static void main(String[] args) {
        callByValue callByValue=new callByValue();
        int a=2;
        valueChange(a);
        System.out.println(a);




    }

    public static void valueChange(int achange)
    {
        achange=13;
    }

}

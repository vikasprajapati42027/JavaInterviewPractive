package org.example.collections.youtubepractice;

public class CallByRefrence {
   int b;
    public static void main(String[] args) {
        CallByRefrence callByRefrence=new CallByRefrence();
        callByRefrence.b=13;
        bchange(callByRefrence);
        System.out.println(callByRefrence.b);
    }
    public static  void bchange(CallByRefrence bcopy)
    {
        bcopy.b=15;
    }
}

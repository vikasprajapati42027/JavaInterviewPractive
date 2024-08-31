package org.example.collections.practice.Date20240821Stream;

public class armStrogeorNot {
//    public static boolean isArm(int n)
//    {
//        int length=String.valueOf(n).length();
//        int sum=String.valueOf(n).chars()
//                .map(ch->Character.digit(ch,10))
//                .map(e->(int)Math.pow(e,length)).sum();
//        return sum==n;
//    }

    public static boolean isArms(int n)
    {
        int len=String.valueOf(n).length();
        int sum=String.valueOf(n).chars().map(e->Character.digit(e,10)).map(e->(int)Math.pow(e,len)).sum();
       return sum==n;
    }
    public static void main(String[] args) {

        int n=153;
        System.out.println(isArms(n));
    }
}

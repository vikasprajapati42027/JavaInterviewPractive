package org.example.collections.practice.Date20231202;

public class palindromenumber {
    public static void main(String[] args) {
        String s="viviv";
        String sb=new StringBuffer(s).reverse().toString();
        System.out.println(sb);
        if(s.equals(sb))
        {
            System.out.println("vikas yes");
        }
        else {
            System.out.println("vikas No");
        }
    }
}

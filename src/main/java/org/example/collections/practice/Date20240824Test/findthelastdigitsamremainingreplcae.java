package org.example.collections.practice.Date20240824Test;

public class findthelastdigitsamremainingreplcae {
    public static void main(String[] args) {
        String str="8871942027";
        if(str.length()>=2)
        {
            String make=str.substring(0,str.length()-2).replaceAll("\\d","#")+str.substring(str.length()-2,str.length());
            System.out.println(make);
        }
    }
}

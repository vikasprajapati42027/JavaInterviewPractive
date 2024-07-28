package org.example.collections.practice.Date20240203;

public class MainBranch {
    public static void main(String[] args) {
        Bank sbi=new SBI();
        System.out.println(sbi.run());
        Bank icici=new ICICI();
        System.out.println(icici.run());
    }
}

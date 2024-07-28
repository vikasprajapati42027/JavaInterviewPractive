package org.example.collections.practice.Date20240508DesignPattern.Structure.Adapter;

public class AdapterInterface {
    public static void main(String[] args) {


        Creaditcard targetinterface = new BankCustomer();
        targetinterface.giveBankDetails();
        System.out.println(targetinterface.getCreaditcard());
    }
}

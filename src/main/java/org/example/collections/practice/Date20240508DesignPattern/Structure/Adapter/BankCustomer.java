package org.example.collections.practice.Date20240508DesignPattern.Structure.Adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements Creaditcard{

    public void giveBankDetails(){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name :");
            String customername=br.readLine();
            System.out.print("\n");

            System.out.print("Enter the account number:");
            long accno=Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.print("Enter the bank name :");
            String bankname=br.readLine();

            setAccName(customername);
            setAccNumb(accno);
            setBankName(bankname);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public String getCreaditcard()
    {
        long accn=getAccNumb();
        String accname=getAccName();
        String BankName=getBankName();


        return "Account Number : "+accn+" Account Name : "+accname+" Bank Name : "+ BankName;


    }
}

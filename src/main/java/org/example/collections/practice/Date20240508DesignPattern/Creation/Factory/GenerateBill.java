package org.example.collections.practice.Date20240508DesignPattern.Creation.Factory;

import java.io.*;

class GenerateBill{
    public static void main(String args[])throws IOException{
        getPlanFactory planFactory = new getPlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String planName=br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);
        //call getRate() method and calculateBill()method of DomesticPaln.

        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}//end of GenerateBill class.

//
//public class GenerateBill {
//    public static void main(String[] args) throws IOException {
//        getPlanFactory planFactory=new getPlanFactory();
//
//        System.out.print("Enter the name of plan for which the bill will be generated: ");
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//
//        String planName=br.readLine();
//        System.out.print("Enter the number of units for bill will be calculated: ");
//        int units=Integer.parseInt(br.readLine());
//
//        Plan p=planFactory.getPlan(planName);
//        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
//        p.getRate();
//        p.calculateBill(units);
//
//    }
//}

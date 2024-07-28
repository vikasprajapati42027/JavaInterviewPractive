package org.example.collections.practice.Date20240508DesignPattern.Creation.Prototype;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class prototypeDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee Id: ");
        int eid = Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Enter Employee Name: ");
        String ename = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Designation: ");
        String edesignation = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Address: ");
        String eaddress = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Salary: ");
        double esalary = Double.parseDouble(br.readLine());
        System.out.print("\n");

        Employee e1 = new Employee(eid, ename, edesignation, eaddress);
        e1.display();



        Employee e2=(Employee) e1.getclone();
     //   Employee e2 = (Employee) e1.getclone();
        e2.display();


    }
}


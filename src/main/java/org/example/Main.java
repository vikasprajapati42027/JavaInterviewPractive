//package org.example;
//
//import org.example.collections.practice.Date20231202.Employee;
//
//import java.io.*;
//
//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args)  throws IOException, ClassNotFoundException {
//        final Employee employee = new Employee();
//        employee.setId(100);
//        employee.setName("ramesh");
//        employee.setAge(100);
//        serilizeProcessing(employee);
//       deSerilizeProcessing(employee);
//        }
//
//        public static void serilizeProcessing(Employee employee) throws IOException {
//
//
//        final FileOutputStream fout=new FileOutputStream("text.txt");
//        final ObjectOutputStream out=new ObjectOutputStream(fout);
//        out.writeObject(employee);
//        out.flush();
//        System.out.println("success");
//     }
//      public static void deSerilizeProcessing(Employee employee) throws IOException,ClassNotFoundException{
//        final ObjectInputStream fin=new ObjectInputStream(new FileInputStream("text.txt"));
//        final Employee employee1= (Employee) fin.readObject();
//          System.out.println(employee1.getId() + "  " + employee1.getName() + "  " + employee1.getAge());
//          fin.close();
//
//
//      }
//    }

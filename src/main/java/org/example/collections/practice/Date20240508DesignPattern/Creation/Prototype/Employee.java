package org.example.collections.practice.Date20240508DesignPattern.Creation.Prototype;

class Employee implements prototype{
    int Id;
    String name;
    String mobile_no;
    String address;

    public Employee(int id, String name, String mobile_no, String address) {
        Id = id;
        this.name = name;
        this.mobile_no = mobile_no;
        this.address = address;
    }
    public void display()
    {
        System.out.println("Id "+Id+" \t Name "+name+"\t "+mobile_no+" \t Address "+address);
    }

    @Override
    public prototype getclone()
    {
      //  System.out.println("clone");
       return new Employee(Id, name, mobile_no, address);
    }

}

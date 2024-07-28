package org.example.collections.practice.Date20240508DesignPattern.Creation.Singleton;

public class Singleton {

//    To implement a singleton pattern, we have different approaches, but all of them have the following common concepts.
//
//    Private constructor to restrict instantiation of the class from other classes.
//    Private static variable of the same class that is the only instance of the class.
//    Public static method that returns the instance of the class, this is the global access point for the outer world to get the instance of the singleton class.
//    In further sections, we will learn different approaches to singleton pattern implementation and design concerns with the implementation.
    private static final Singleton singleton=new Singleton();


    private Singleton()
    {

    }

    public static Singleton getSingleton()
    {

        return  singleton;
    }
    void display(){
        System.out.println("vikas");
    }

    public static void main(String[] args) {

        singleton.display();
    }
}

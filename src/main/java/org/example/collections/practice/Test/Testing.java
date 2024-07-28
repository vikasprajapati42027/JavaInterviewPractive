package org.example.collections.practice.Test;

public class Testing
{ public static void main(String[] args)
{ Testing t = null;
    t.display();
    // no null pointer exception
    //
    } public static void display(){ System.out.println("Inside static method");
} public void show()
{ System.out.println("Inside non-static method");
} }

  //  Read more: https://www.java67.com/2016/04/difference-between-static-vs-non-static-method-in-java.html#ixzz8MVO92ZcT
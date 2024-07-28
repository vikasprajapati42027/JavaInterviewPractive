package org.example.collections.practice.Date20240204;

import java.io.Console;
import java.io.IOException;

public class ConsolePrint {
    public static void main(String[] args) throws IOException {
        Console c1=System.console();
        System.out.println("Enter your name: ");
        String n=c1.readLine();
        System.out.println("Welcome "+n);
    }
}

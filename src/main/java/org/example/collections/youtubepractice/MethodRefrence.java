package org.example.collections.youtubepractice;

public class MethodRefrence {
    public static void main(String[] args) {
        Funtion funtion=Test::vikasp;
        funtion.vikasp();

    }
}
class Test
{
    public static void vikasp()
    {
        System.out.println("vikas prajapati");
    }
}

package org.example.collections.practice.Date20240605;

public class test2 {
    Test1 t1;

    public test2(Test1 t1) {
        this.t1 = t1;
    }



    public static void main(String[] args) {
       test2 t2=new test2(new Test1("vikas",101));
        System.out.println(t2.t1.getId()+" "+t2.t1.getName());
    }
}

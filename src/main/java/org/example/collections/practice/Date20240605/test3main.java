package org.example.collections.practice.Date20240605;

public class test3main {

    test2 t2;

    public test3main(test2 t2) {
        this.t2 = t2;
    }
    public static void printmsg()
    {
        System.out.println("vikas prajapati");
    }
    public void pmsg()
    {
        printmsg();
    }
    public static void main(String[] args) {
        test3main t3=new test3main(new test2(new Test1("aakash",101)));

        System.out.println(t3.t2.t1.getId()+" "+t3.t2.t1.getName());
        t3.pmsg();
    }
}

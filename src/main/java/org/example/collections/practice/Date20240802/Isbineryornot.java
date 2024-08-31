package org.example.collections.practice.Date20240802;

public class Isbineryornot {
    public static void checkBinery(int n)
    {
        int res=0;
        boolean isbinary=true;
        int temp=n;
        while(temp!=0)
        {
            res=temp%10;
            if(res>1)
            {
                isbinary=false;
                break;

            }else {
                temp=temp/10;
            }

        }
        if(isbinary)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("not");
        }
       // return true;

    }

    public static void main(String[] args) {
        int n=101016;
       checkBinery(n);
    }
}

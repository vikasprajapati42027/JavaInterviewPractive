package org.example.collections.practice.Date20240722;

public class CheckisBinaryOrNot {

    public static void isBinaryOrNot(int n)
    {
        boolean isbinary=true;
        int temp=n;
        int res=0;
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
            System.out.println("Yes");
        }else {
            System.out.println("not");
        }
    }

    public static void main(String[] args) {
         isBinaryOrNot(10114);
    }
}

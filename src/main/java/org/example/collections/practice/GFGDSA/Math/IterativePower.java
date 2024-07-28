package org.example.collections.practice.GFGDSA.Math;

public class IterativePower {
    public static int ispower(int n,int x)
    {
        if(n%2==0)
        {
            return ispower(n,x/2) * ispower(n,x/2);
        }
        else {
            return ispower(n,x/2)*n;
        }
    }
    public static void main(String[] args) {
       int n2;int x2;
        System.out.println(ispower(2,3));
    }
}

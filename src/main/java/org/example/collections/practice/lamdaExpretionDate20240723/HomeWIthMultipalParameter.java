package org.example.collections.practice.lamdaExpretionDate20240723;

public class HomeWIthMultipalParameter {


    public static void main(String[] args) {
        Store store=(v1,v2)->v1*v2;
        int x=store.get(3,5);
        System.out.println(x);
    }

    interface Store{
        int get(int a,int b);
    }
}

package org.example.collections.practice.lamdaExpretionDate20240723;

public class HomeWithLamda {
    public static void main(String[] args) {

        Store store = ()->7;
        int x=store.get();
        System.out.println(x);
    }
    interface Store
    {
        int get();
    }
}

package org.example.collections.practice.lamdaExpretionDate20240723;

public class Home {
    public static void main(String[] args) {
        Store store=new Store() {
            @Override
            public void  get() {

                System.out.println("vikas prajapati");
            }
        };
       store.get();

    }

    interface Store{
        public void get();
    }
}

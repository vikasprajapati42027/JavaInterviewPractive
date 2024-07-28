package org.example.collections.practice.Date20240605;

import java.util.ArrayList;
import java.util.List;

public class Service implements Repository{


    public List<product> findAll()
    {
        ArrayList<product> products=new ArrayList<>();
        products.add(new product(101,"vikas",27));
        products.add(new product(102,"prajapati",28));
        return products;
    }

    public static void main(String[] args) {
        Service service=new Service();
        System.out.println(service.findAll());
    }
}

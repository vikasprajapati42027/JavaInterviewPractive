package org.example.collections.practice.Date20240605;

import java.util.List;

public class Controller {
    Service service;


    public Controller() {
    }

    public List<product> getData()
    {
        return service.findAll();
    }

    public static void main(String[] args) {
       Controller controller=new Controller();
      //  System.out.println(controller.service.findAll());
        System.out.println(controller.getData());
    }
}

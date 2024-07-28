package org.example.collections.practice.MutiThreading.M20240604.synchronizedblock;

public class msg {

    public void show(String name)
    {

        synchronized (this)
        {
            for(int i=0;i<3;i++) {
                System.out.println("how are u...." + name);
            }
        }
    }

}

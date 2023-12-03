package org.example.collections.arrayList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Serilizableanddeserilizable {

    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("vikas");
        al.add("prajapati");



        try
        {
            FileOutputStream fout=new FileOutputStream("file.txt");
            ObjectOutputStream oout=new ObjectOutputStream(fout);
            oout.writeObject(al);
            fout.close();
            oout.close();


            FileInputStream fin=new FileInputStream("file.txt");
            ObjectInputStream oin=new ObjectInputStream(fin);
            ArrayList list=(ArrayList)oin.readObject();
            Iterator it=list.iterator();
            while(it.hasNext())
            {
                System.out.println(list.get(1));
            }


        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

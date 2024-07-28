package org.example.collections.Map;

import java.util.HashMap;
import java.util.Map;

public class countNumer {
    public static void main(String[] args) {
        String str="vikas prajapati my name ";
        String words[]=str.split(" ");
        str.split(" ");
        //str.substring(0,1).toUpperCase()+str.substring(1);
        String wordss[]=str.split(" ");
        for(String word:words)
        {
            System.out.print(capitalize(word)+ " ");
           // String rever=str.substring(0,1).toUpperCase()+str.substring(1);
        }



     //   System.out.println(rever);
       // System.out.println(capitalize(str));
    }
    public static final String capitalize(String str)
    {
        if (str == null || str.length() == 0) return str;
       // return str.substring(0, 1).toUpperCase() + str.substring(1);
      //  return str.substring(0,1).toUpperCase()+str.substring(1);
        return str.substring(0).toUpperCase()+str.substring(1);
    }
}

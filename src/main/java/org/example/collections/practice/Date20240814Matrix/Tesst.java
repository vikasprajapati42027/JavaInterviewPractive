package org.example.collections.practice.Date20240814Matrix;

import java.util.HashMap;
import java.util.Map;

public class Tesst {
    public static void main(String[] args) {
        String str = "GeeksforGeeks password is : 1234";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=48 && str.charAt(i)<=57)
            {
                count++;
            }
        }
        System.out.println(count);


    }
}

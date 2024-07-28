package org.example.collections.practice.GFGDSA.Math;

import java.sql.SQLOutput;

public class alldivisionnumber {
    public static void main(String[] args) {
        int value=125;
        for(int i=1;i<=value;i++)
        {
            if(value%i==0)
            {
                System.out.println(i);
            }
        }
    }
}

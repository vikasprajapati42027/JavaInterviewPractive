package org.example.collections.practice.Date20240204;

import java.util.StringTokenizer;

public class StringTokenizer1 {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("Hello my name is vikas");
        while(st.hasMoreTokens())
        {
            System.out.print(st.nextToken()+" ");
        }
    }
}

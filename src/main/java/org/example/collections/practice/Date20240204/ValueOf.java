package org.example.collections.practice.Date20240204;

import java.util.Arrays;

public class ValueOf {
    public static void main(String[] args) {
        String arr[]={"3","30","43","5","9"};
           String ans="";
            Arrays.sort(arr, (n1, n2)->(n2+n1).compareTo(n1+n2));

            for(String s:arr)
            {
              ans+=s;
            }
            System.out.println(ans);
        }


}

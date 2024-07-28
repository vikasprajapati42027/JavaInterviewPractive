package org.example.collections.practice.Date20240113;

public class swapTwoVariable {
    public static void main(String[] args) {
        String str1="vikas";
        String str2="prajapati";

        str1=str1+str2;
        str2=str1.substring(0, str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println(str1+" "+str2);

      str1=str1+str2;
      str2=str1.substring(0,str1.length()-str2.length());
      str1=str1.substring(str2.length());

        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length())
;    }
}

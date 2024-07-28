package org.example.collections.practice.Date20240106;

public class FirstcharacterisUpper {
    public static String isUppercase(String str)
    {
        //StringBuilder str1=new StringBuilder();
        return str.toUpperCase().charAt(0)+str.substring(1,str.length());
    }
    public static void main(String[] args) {
        String str="vikas prajapati";
        String words[]=str.split("\\s");
        for(String word:words) {
            System.out.print(isUppercase(word)+ " ");
        }
    }
}

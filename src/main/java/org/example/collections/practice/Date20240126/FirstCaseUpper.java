package org.example.collections.practice.Date20240126;

public class FirstCaseUpper {
    public static String IsupperTo(String str)
    {
        String s1[]=str.split(" ");
        StringBuffer sb=new StringBuffer();
        String ans="";
        for(String s:s1)
        {
            ans+= s.toUpperCase().charAt(0)+s.substring(1,s.length())+" ";
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="my name is vikas";
        //String str1[] = str.split("\\s");
//        String ans="";
//        for(String s:str1) {
//           ans+= s.toUpperCase().charAt(0) + s.substring(1, s.length());
//        }
        System.out.println(IsupperTo(str));
    }
}

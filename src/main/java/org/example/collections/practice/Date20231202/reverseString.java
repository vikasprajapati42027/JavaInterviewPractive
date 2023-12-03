package org.example.collections.practice.Date20231202;

public class reverseString {

    public static String   rever(String str)
    {
        char temp;
        char[] ch=str.toCharArray();
        int i=0;int j=str.length()-1;
        while(i<j)
        {
            temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        String s1=String.valueOf(ch);
        return s1;

    }
    public static void main(String[] args) {
        String str="vikas";

        System.out.println(rever(str));
    }
}

package org.example.collections.practice.Date20231230;

public class RemovingAllTheWhitespaces {

    public static String swap(String str,int i,int j)
    {
        char[] ch=str.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }
    public static void permute(String str,int l,int r)
    {
        if(l==r)
        {
            System.out.println(str);
        }
        else
        for(int i=l;i<r;i++)
        {
            str=swap(str,l,i);
            permute(str,l+1,r);
            str = swap(str,l,i);
        }
    }
    public static void main(String[] args) {
        String strr="ABC";
       permute(strr,0,strr.length());
    }
}

package org.example.collections.practice.Date20240106;

public class Permutation {
    public static String swap(String str,int i,int j)
    {
        char[] ch=str.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;

        return String.valueOf(ch);
    }

    public static void permu(String str,int l,int r)
    {
        if(l==r)
        {
            System.out.println(str);
        }
        for(int i=l;i<r;i++)
        {
            str=swap(str,l,i);
            permu(str,l+1,r);
            str=swap(str,l,i);
        }
    }

    public static void main(String[] args) {
        String str="ABC";
        permu(str,0,str.length());
    }
}

package org.example.collections.practice.Date20240113;

public class permutations {
    public static String swap(String str,int l,int r)
    {
        char ch[]=str.toCharArray();
        char temp=ch[l];
        ch[l]=ch[r];
        ch[r]=temp;
        return String.valueOf(ch);
    }
    public static void permute(String str,int l,int r)
    {
        if(l==r)
        {
            System.out.println(str);
        }
        else {
            for(int i=l;i<r;i++)
            {
                str=swap(str,l,i);
                permute(str,l+1,r);
                str=swap(str,l,i);
            }
        }
    }


    public static void main(String[] args) {
        String str="ABC";
        permute(str,0,str.length());

    }
}

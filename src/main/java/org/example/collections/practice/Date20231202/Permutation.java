package org.example.collections.practice.Date20231202;

public class Permutation {
    public static String swap(String str1,int i,int j)
    {
        char temp;
        char[] ch=str1.toCharArray();
        temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;

        return String.valueOf(ch);
    }

    public static void permutations(String str,int l,int r)
    {
        if(l==r)
        {
            System.out.println(str);
        }
        for(int i=l;i<r;i++)
        {
            str=swap(str,l,i);
            permutations(str,l+1,r);
            permutations(str,l,i);
        }
    }
//    public static String  swap(String str,int i,int j)
//    {
//        char temp;
//        char[] ch=str.toCharArray();
//        temp=ch[i];
//        ch[i]=ch[j];
//        ch[j]=temp;
//        return String.valueOf(ch);
//    }
//
//    public  static void permutations(String str,int l,int r)
//    {
//        if(l==r)
//        {
//            System.out.println(str);
//        }
//        else {
//            for(int i=0;i<str.length();i++)
//            {
//                str=swap(str,l,i);
//                permutations(str,l+1,r);
//                str=swap(str,l,i);
//            }
//        }
//    }
    public static void main(String[] args) {
  String str="ABC";
  permutations(str,0,str.length()-1);
    }
}

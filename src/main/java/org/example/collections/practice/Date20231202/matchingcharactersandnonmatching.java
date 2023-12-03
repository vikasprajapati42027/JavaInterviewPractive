package org.example.collections.practice.Date20231202;

public class matchingcharactersandnonmatching {
    public  static void count(String str1,String str2)
    {
        int c=0;
        for(int i=0;i< str1.length();i++)
        {
            if(str2.indexOf(str1.charAt(i))>0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
       String  str1 = "aabcddekll12";
       String str2 = "bb22ll@55k";
       count(str1,str2);

    }
}

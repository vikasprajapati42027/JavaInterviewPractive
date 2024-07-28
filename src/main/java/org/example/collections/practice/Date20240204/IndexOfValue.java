package org.example.collections.practice.Date20240204;

public class IndexOfValue {
    public static void main(String[] args) {
   String str[]={"vikas","prajapati","viveks","vijay","vinasy"};
   String str1[]={"999323","99993252","999234"};
   String prefix=str1[0];
   for(String s:str1)
       if(s.indexOf(prefix)!=0)
       {
           prefix=prefix.substring(0,prefix.length()-1);
       }
   System.out.println(prefix);
    }

}

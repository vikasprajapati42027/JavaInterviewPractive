package org.example.collections.practice.Date20240106;

public class Voweladconsolated {
    public static void main(String[] args) {
        String str="vikas";
        int vowel=0,conso=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                vowel++;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                conso++;
            }
        }
        System.out.println("Vowel is : "+ vowel+ " Consonenet is : "+conso);
    }
}

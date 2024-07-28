package org.example.collections.practice.Date20240113;

public class FirstCharactorShouldbeCapital {
    public  static String FirstCapital(String str)
    {
        char word[]=str.toCharArray();
        for(char i=0;i<str.length();i++)
        {
           word[i]= (char) (word[i]+32);
        }
        return String.valueOf(word);
    }
    public static void main(String[] args) {
        String str="my name is vikas prajapati";
        String words[]=str.split(" ");
        for(String word:words) {
            System.out.print(FirstCapital(word)+" " );
        }
    }
}

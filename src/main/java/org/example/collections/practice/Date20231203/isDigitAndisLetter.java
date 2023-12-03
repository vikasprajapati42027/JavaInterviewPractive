package org.example.collections.practice.Date20231203;

public class isDigitAndisLetter {
    public static void main(String[] args) {
        String str="vikas12";
        char[] ch1=str.toCharArray();
        for(char ch:ch1 )
        if(Character.isDigit(ch))
        {
            System.out.println(ch+ "yes");
        }
        else
        {
            System.out.println("not ");
        }
    }
}

package org.example.collections.practice.Date20231203;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class isDigitAndisLetter {

    public  static boolean  isDigite(String str)
    {
        String regex="[0-9]";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(str);

        return matcher.find();



    }
    public static void main(String[] args) {
        String str="12";
        System.out.println(isDigite(str));


//        char[] ch1=str.toCharArray();
//        for(char ch:ch1 )
//        if(Character.isDigit(ch))
//        {
//            System.out.println(ch+ "yes");
//        }
//        else
//        {
//            System.out.println("not ");
//        }
    }
}

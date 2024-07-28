package org.example.collections.practice.Date20231203;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class checkVowelAndConstanctusingPattern {
    public static void main(String[] args) {

String str="vikas";
String reggex="[aeiou]";
Pattern pattern=Pattern.compile("reggex");
Matcher matcher=pattern.matcher(str);
if(matcher.find())
{
    System.out.println("yes");
}
//        String str = "vikas";
//        String regex = "[aeiouAEIOU]";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(str);
//        if (matcher.find()) {
//            System.out.println("yes");
//        }
    }

}

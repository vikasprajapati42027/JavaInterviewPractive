package org.example.collections.practice.Date20231202;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class usingpatternmatternumber {


    public static boolean removeNonNumber(String str)
    {
        String regex="[0-9]";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(str);
        Pattern pattern2=Pattern.compile(regex);
        Matcher matcher2=pattern2.matcher(str);

        return matcher2.find();

        //return matcher.replaceAll("");
    }
//    public static String
//    removingNonNumericCharacters(String str)
//    {
//
//        // Create a regular expression
//        String regex = "[^0-9]";
//
//        // Compile the regex to create pattern
//        // using compile() method
//       Pattern pattern = Pattern.compile(regex);
//      //  Pattern pattern=
//
//        // Get a matcher object from pattern
//        Matcher matcher = pattern.matcher(str);
//
//        // Replace every matched pattern with the
//        // target string using replaceAll() method
//        return matcher.replaceAll("");
//    }
    public static String patternmatcher(String str)
    {
        String regex="[^vikas]";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(str);

        return matcher.replaceAll("");
    }


    public static void main(String[] args) {
    String str="viaks123";
    System.out.println(patternmatcher(str));
    }
}

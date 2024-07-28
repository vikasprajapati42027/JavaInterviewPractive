package org.example.collections.practice.Date20240605;

import java.util.Arrays;

public class Pramidprint {
    public static void main(String[] args) {
     drawPyramidPattern();
        System.out.println(StringAngram("vikas","vikas"));
    }
    public static boolean  StringAngram(String str1,String str2)
    {
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);

    }
//    public static void drawPyramidPattern()
//    {
//        for(int i=0;i<5;i++)
//        {
//           for(int j=0;j<5-i;j++)
//               System.out.print(" ");
//           for(int k=0;k<=i;k++)
//               System.out.print("* ");
//            System.out.println();
//        }
//    }
public static void drawPyramidPattern() {
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5 - i; j++)
            System.out.print(" ");
        for (int k = 1; k <= i; k++)
            System.out.print("* ");

        System.out.println();
    }
}
}

package org.example.collections.practice.DesignPattern;

public class Reverse_number_Triangle {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
//        int i, j;
//// outer loop to handle rows
//        for (i = 1; i <= n; i++) {
//
//        // inner loop to print spaces.
//        for (j = 1; j < i; j++) {
//        System.out.print(" ");
//            }
//
//                    // inner loop to print value of j.
//                    for (j = i; j <= n; j++) {
//        System.out.print(j + " ");
//            }
//
//                    // printing new line for each row
//                    System.out.println();
//        }
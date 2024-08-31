package org.example.collections.practice.Date20240814Matrix;

public class VerticalFlipMatrix {

    public static void verticalFlip(int[][] matrix) {
        int rowcount=matrix.length;
        for(int i=0;i<rowcount/2;i++) {
            int[] temp=matrix[i];
            matrix[i]=matrix[rowcount-i-1];
            matrix[rowcount-i-1]=temp;

         }
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        verticalFlip(matrix);

        // Print the flipped matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


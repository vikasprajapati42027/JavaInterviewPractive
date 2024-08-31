package org.example.collections.practice.Date20240814Matrix;

public class HorizontalFlipMatrix {
    public static void horizontalFlip(int[][] matrix)
    {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col/2;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][col-j-1];
                matrix[i][col-j-1]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        horizontalFlip(matrix);

        // Print the flipped matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

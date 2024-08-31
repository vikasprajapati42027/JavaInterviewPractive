package org.example.collections.practice.Date20240814Matrix;

import java.sql.SQLOutput;

public class snakmatrix {
  public static void horizontalFlip(int[][] matrix)
  {
      int row=matrix.length;
      int col=matrix[0].length;
      for(int i=0;i<row;i++)
      {
          if(i%2==0)
          {
              for(int j=0;j<col;j++)
              {
                  System.out.println(matrix[i][j]+" ");
              }

          }  else
          {
              for(int j=col-1;j>=0;j--)
              {
                  System.out.println(matrix[i][j]+" ");
              }
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

package org.example.collections.practice.Date20240814Matrix;

public class ZeroMatrix {
    public static void setMatrixZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[] zerorow=new boolean[row];
        boolean[] zerocol=new boolean[col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    zerorow[i]=true;
                    zerocol[j]=true;
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(zerorow[i]||zerocol[j])
                {
                    matrix[i][j]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };

        // Function call
        setMatrixZeroes(matrix1);

        // Print the modified matrix
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }

}

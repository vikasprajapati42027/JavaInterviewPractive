package org.example.collections.practice.interviewtest;

import java.util.HashSet;
import java.util.Set;

public class MatrixZero {

    public static void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        Set<Integer> rowsToZero = new HashSet<>();
        Set<Integer> colsToZero = new HashSet<>();

        // Step 1: Identify the rows and columns that need to be zeroed
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r][c] == 0) {
                    rowsToZero.add(r);
                    colsToZero.add(c);
                }
            }
        }

        // Step 2: Set the identified rows to zero
        for (int r : rowsToZero) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = 0;
            }
        }

        // Step 3: Set the identified columns to zero
        for (int c : colsToZero) {
            for (int r = 0; r < rows; r++) {
                matrix[r][c] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {0, 8, 9}
        };

        setZeroes(matrix);

        // Print the modified matrix
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}

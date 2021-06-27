/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/* Nhập ma trận n hàng, m cột (n > 0, m > 0). Nhập vào 2 số là 2 cột trong ma trận. Hoán vị 2 cột trong ma trận
 *
 * @author Ame
 */
public class Ex43 {

    static int[][] permutation(int[][] matrix, int col1, int col2) {
        for (int i = 0; i < matrix.length; i++) {
                int tmp = matrix[i][col1];
                matrix[i][col1] = matrix[i][col2];
                matrix[i][col2] = tmp;
            
        }

        return matrix;
    }

    static void printMatrix(int[][] matrix) {

        System.out.println("Matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }

    public static void main(String[] args) {

        int matrix[][] = {
            {1, 2, 3, 12},
            {4, 5, -6, 11},
            {13, 14, 15, 18},
            {7, 8, 9, 10},
            {11, 14, 15, 16}

        };

        int col1 = 1;
        int col2 = 3;

        printMatrix(matrix);
        printMatrix(permutation(matrix, col1, col2));
    }
}

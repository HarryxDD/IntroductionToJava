/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/* Nhập ma trận n hàng, m cột (n > 0, m > 0). Nhập vào 2 số là 2 dòng trong ma trận. Hoán vị 2 dòng trong ma trận
 *
 * @author Ame
 */
public class Ex42 {
    
   
    static int[][] permutation(int[][] matrix, int row1, int row2) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int tmp = matrix[row1][j];
                matrix[row1][j] = matrix[row2][j];
                matrix[row2][j] = tmp;
            }
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
            {1, 2, 3, 10},
            {4, 5, -7, 11},
            {13, 14, 15, 16},
            {7, 8, 9, 12},
            {13, 14, 15, 16}

        };
        
        int row1 = 1;
        int row2 = 4;

        printMatrix(matrix);
        printMatrix(permutation(matrix, row1, row2));
    }
}

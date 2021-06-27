/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/* Nhập ma trận n hàng, m cột (n > 0, m > 0). Tính tổng các giá trị nằm trên biên của ma trận
 *
 * @author Ame
 */
public class Ex36 {
    static void printMatrix(int[][] matrix) {

        System.out.println("Matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int sum = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        
        int sumInside = 0;
        
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 1; j++) {
                sumInside += matrix[i][j];
            }
        }
        
        sum -= sumInside;
        
        System.out.println("sum: " + sum);
    }

    public static void main(String[] args) {

        int matrix[][] = {
            {1, 2, 3, 10},
            {4, 5, 6, 11},
            {7, 8, 9, 12},
            {13, 14, 15, 16}
        };

        printMatrix(matrix);
    }
}

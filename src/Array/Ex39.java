/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/* Nhập ma trận n hàng, m cột (n > 0, m > 0). Liệt kê các cột có tổng nhỏ nhất

 *
 * @author Ame
 */
public class Ex39 {

    static void sumMin(int[][] matrix) {

        int[][] newMatrix = new int[matrix[0].length][matrix.length];

        int maxSum = 0;
        
        for (int i = 0; i < newMatrix.length; i++) {

            int sumCol = 0;
            for (int j = 0; j < newMatrix[i].length; j++) {

                sumCol += matrix[j][i];

            }
            
            if (sumCol > maxSum) {
                maxSum = sumCol;
            }
        }
        
        int minSum = maxSum;
        int minColumn = 0;
        int minColumnSize = 0;

        for (int i = 0; i < newMatrix.length; i++) {

            int sumCol = 0;
            for (int j = 0; j < newMatrix[i].length; j++) {

                sumCol += matrix[j][i];

            }
            System.out.println(sumCol);

            if (sumCol < minSum) {
                minSum = sumCol;
                minColumn = i + 1;
            }
        }

        for (int i = 0; i < newMatrix.length; i++) {
            
            int sumCol = 0;
            for (int j = 0; j < newMatrix[i].length; j++) {
                sumCol += matrix[j][i];
                
            }
            
            if (sumCol == minSum) {
                minColumnSize++;             
            }
        }
        
        int[] minColList = new int[minColumnSize];
        int m = 0;
        for (int i = 0; i < newMatrix.length; i++) {
            
            int sumCol = 0;
            for (int j = 0; j < newMatrix[i].length; j++) {
                sumCol += matrix[j][i];
                
            }
            
            if (sumCol == minSum) {
                minColList[m] = i+1;
                m++;
            }
        }
        

        
        System.out.println("Min Sum: " + minSum);
        System.out.println("Min Col: " + minColumn);
        System.out.println("Min Col List: " + Arrays.toString(minColList));
        
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

        printMatrix(matrix);
        sumMin(matrix);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/* Nhập ma trận n hàng, m cột (n > 0, m > 0). Liệt kê các dòng có nhiều số chẵn nhất
 *
 * @author Ame
 */
public class Ex40 {

    static void evenNum(int[][] matrix) {

        int evenMax = 0;
        int maxEvenSize = 0;

        for (int i = 0; i < matrix.length; i++) {
            int evenNum = 0;

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] % 2 == 0) {
                    evenNum++;
                }
            }

            if (evenNum > evenMax) {
                evenMax = evenNum;
            }

        }

        System.out.println(evenMax);
        for (int i = 0; i < matrix.length; i++) {

            int evenNum = 0;

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] % 2 == 0) {
                    evenNum++;
                }
            }

            if (evenNum == evenMax) {
                maxEvenSize++;
            }
        }

        int[] maxEvenList = new int[maxEvenSize];
        int m = 0;
        for (int i = 0; i < matrix.length; i++) {

            int evenNum = 0;

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] % 2 == 0) {
                    evenNum++;
                }
            }

            if (evenNum == evenMax) {
                maxEvenList[m] = i + 1;
                m++;
            }
        }

       
        System.out.println("Max Even List: " + Arrays.toString(maxEvenList));

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

        printMatrix(matrix);
        evenNum(matrix);
    }
}

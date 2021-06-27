/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/* Nhập ma trận n hàng, m cột (n > 0, m > 0). Liệt kê các dòng có nhiều số nguyên tố nhất
 *
 * @author Ame
 */
public class Ex41 {
    
    static boolean isPrimeNum(int n) {
        if (n < 2) {
            return false;
        }
        
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    static void primeNum(int[][] matrix) {

        int primeMax = 0;
        int maxPrimeSize = 0;

        for (int i = 0; i < matrix.length; i++) {
            int primeNum = 0;

            for (int j = 0; j < matrix[i].length; j++) {

                if (isPrimeNum(matrix[i][j])) {
                    primeNum++;
                }
            }

            if (primeNum > primeMax) {
                primeMax = primeNum;
            }

        }

        System.out.println(primeMax);
        for (int i = 0; i < matrix.length; i++) {

            int primeNum = 0;

            for (int j = 0; j < matrix[i].length; j++) {

                if (isPrimeNum(matrix[i][j])) {
                    primeNum++;
                }
            }

            if (primeNum == primeMax) {
                maxPrimeSize++;
            }
        }

        int[] maxPrimeList = new int[maxPrimeSize];
        int m = 0;
        for (int i = 0; i < matrix.length; i++) {

            int primeNum = 0;

            for (int j = 0; j < matrix[i].length; j++) {

                if (isPrimeNum(matrix[i][j])) {
                    primeNum++;
                }
            }

            if (primeNum == primeMax) {
                maxPrimeList[m] = i + 1;
                m++;
            }
        }

       
        System.out.println("Max Even List: " + Arrays.toString(maxPrimeList));

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
            {7, 5, 9, 11},
            {13, 14, 15, 16}

        };

        printMatrix(matrix);
        primeNum(matrix);
    }
}

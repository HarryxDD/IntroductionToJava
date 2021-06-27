/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/* Nhập ma trận n hàng, m cột (n > 0, m > 0). Đếm số lượng số nguyên tố trong ma trận
 *
 * @author Ame
 */
public class Ex33 {
    static int[][] inputMatrix() {
        int n, m;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input rows: ");
        n = scanner.nextInt();
        System.out.println("Input columns: ");
        m = scanner.nextInt();

        // khai báo và cấp phát bộ nhớ cho mảng
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Input element [" + i + ", " + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

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
    
    static void printMatrix(int[][] matrix) {
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }
        
        int countPrime = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isPrimeNum(matrix[i][j])) {
                    countPrime++;
                }
            }
        }
        
        System.out.println("Prime Num: " + countPrime);

    }
    

    public static void main(String[] args) {
        
        printMatrix(inputMatrix());
    
    }
}

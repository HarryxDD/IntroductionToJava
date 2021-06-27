/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/* Nhập ma trận n hàng, m cột (n > 0, m > 0). Nhập vào chỉ số cột, tính tích các giá trị dương trên cột đó trong ma trận 
 *
 * @author Ame
 */
public class Ex35 {

    static void printMatrix(int[][] matrix) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        int m = matrix[n].length + 1;
        while (m > matrix[n].length || m < 0) {
            System.out.println("Input Column: ");
            m = sc.nextInt();
        }

        int sum = 1;

        System.out.println("Matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int j = 0; j < matrix[m - 1].length; j++) {
            if (matrix[j][m - 1] > 0) {
                sum *= matrix[j][m - 1];
            }
        }

        System.out.println("Sum: " + sum);

    }

    public static void main(String[] args) {

        int matrix[][] = {
            {1, 2, 3},
            {4, -5, 6},
            {7, 8, 9}
        };

        printMatrix(matrix);
    }
}

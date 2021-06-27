/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/* Nhập ma trận n hàng, m cột (n > 0, m > 0). Nhập vào chỉ số dòng, tính tổng các giá trị trên dòng đó trong ma trận
 *
 * @author Ame
 */
public class Ex34 {
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
    
    static void printMatrix(int[][] matrix) {
        
        Scanner sc = new Scanner(System.in);
        int n = matrix.length + 1;
        while (n > matrix.length || n < 0) {
            System.out.println("Input Row");
            n = sc.nextInt();
        }
                
        
        int sum = 0;
        
        System.out.println("Matrix: ");
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }
        
        for (int j = 0; j < matrix[n-1].length; j++) {
            sum += matrix[n-1][j];
        }

        
        System.out.println("Sum: " + sum);

    }
    

    public static void main(String[] args) {
        
        printMatrix(inputMatrix());
    
    }
}

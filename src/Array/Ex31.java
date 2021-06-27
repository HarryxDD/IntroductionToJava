/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/* Nhập ma trận n hàng, m cột (n > 0, m > 0). In ra mang trận vừa nhập và tổng các phần tử lẻ của ma trận
 *
 * @author Ame
 */
public class Ex31 {
    static int[][] inputMatrix() {
        int n = 0, m = 0;

        Scanner scanner = new Scanner(System.in);

        

        while (n <= 0 & m <= 0) {
          
            System.out.println("Input rows: ");
            String row = scanner.nextLine();
            System.out.println("Input columns: ");
            String column = scanner.nextLine();
            
            try {

                n = Integer.parseInt(row);
                m = Integer.parseInt(column);

                break;

            } catch (Exception e) {
                System.out.println("ERROR: " + e);
            }
        }
        
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
                if (matrix[i][j] % 2 != 0) {
                    sum += matrix[i][j];
                }
            }
        }
        
        System.out.println(sum);
    }
    

    public static void main(String[] args) {
        
        printMatrix(inputMatrix());
    
    }
}

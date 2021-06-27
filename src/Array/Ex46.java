/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/* Nhập ma trận vuông (n x n). Kiểm tra đường chéo chính có tăng dần hay ko
 *
 * @author Ame
 */
public class Ex46 {
    static int[][] inputMatrix() {
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input rows: ");
        n = scanner.nextInt();

        // khai báo và cấp phát bộ nhớ cho mảng
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Input element [" + i + ", " + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    static boolean isAscending(int[][] matrix) {
        
        int[] diagonal = new int[matrix.length];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    diagonal[i] = matrix[i][j];
                }
            }
        }
        
        for (int i = 0; i < diagonal.length - 1; i++) {
            if (diagonal[i] > diagonal[i + 1]) {
                return false;
            }
        }
        
        System.out.println(Arrays.toString(diagonal));
        
        
        return true;
    }
    
    static void printArray(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        
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
        
        System.out.println(isAscending(inputMatrix()));
    
    }
}

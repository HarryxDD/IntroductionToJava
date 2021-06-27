/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import static Array.Ex42.permutation;

/* Nhập ma trận n hàng, m cột (n > 0, m > 0). Sắp xếp các phần tử trên các dòng tăng dần từ trái sang phải
 *
 * @author Ame
 */
public class Ex44 {
    
    static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
    
    static int[][] sortRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                bubbleSort(matrix[i]);
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
            {10, 2, 1, 3},
            {4, -5, -7, 11},
            {13, 16, 5, 14}

        };
        
      

        printMatrix(matrix);
        printMatrix(sortRow(matrix));
    }
}

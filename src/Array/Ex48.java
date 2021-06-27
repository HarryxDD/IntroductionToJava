/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import static Array.Ex47.diagonal;

/* Nhập ma trận vuông (n x n). Sắp xếp chéo chính tăng dần
 *
 * @author Ame
 */
public class Ex48 {
    
    static int[][] diagonal(int[][] matrix) {
        
        int[] mainDiagonal = new int[matrix.length];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    mainDiagonal[i] = matrix[i][j];
                }
            }
        }
        
        bubbleSort(mainDiagonal);

        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = mainDiagonal[i];
                }
            }
        }
        
        return matrix;
    }
    
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
        int[][] matrix = {
                {11, 2, 23},
                {4, 56, 6},
                {73, 8, 19}
            };
    
        printMatrix(diagonal(matrix));
        
    }
}

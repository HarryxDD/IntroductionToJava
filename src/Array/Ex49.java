/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/* Nhập ma trận vuông (n x n). Sắp xếp chéo phụ giảm dần
 *
 * @author Ame
 */
public class Ex49 {
    static int[][] antiDiagonal(int[][] matrix) {
        
        int[] antiDiagonal = new int[matrix.length];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i + j) == matrix.length - 1) {
                    antiDiagonal[i] = matrix[i][j];                }
            }
        }
        
        bubbleSort(antiDiagonal);

        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i + j) == matrix.length - 1) {
                    matrix[i][j] = antiDiagonal[i];
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
                {11, 2, 239},
                {4, 56, 6},
                {723, 8, 19}
            };
    
        printMatrix(antiDiagonal(matrix));
        
    }
}

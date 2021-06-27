/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/* Nhập ma trận VUÔNG (n x n), tính tổng các phần tử trên đường chéo chính và đường chéo phụ
 *
 * @author Ame
 */
public class Ex47 {
    
    static void diagonal(int[][] matrix) {
        
//        int[] mainDiagonal = new int[matrix.length];
//        int[] secondDiagonal = new int[matrix.length];

        int sumMain = 0;
        int sumAntiDiagonal  = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    //mainDiagonal[i] = matrix[i][j];
                    sumMain += matrix[i][j];
                }
                if ((i + j) == matrix.length - 1) {
                    //secondDiagonal[i] = matrix[i][j];
                    sumAntiDiagonal  += matrix[i][j];
                }
            }
        }
        
        
        
        System.out.println("Sum Main: " + sumMain);
        System.out.println("Sum Anti Diagonal : " + sumAntiDiagonal );
        
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
    
        diagonal(matrix);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import static Array.Ex37.printMatrix;
import java.util.Arrays;
import java.util.Scanner;

/* Nhập ma trận n hàng, m cột (n > 0, m > 0).  Liệt kê các dòng có tổng lớn nhất
 *
 * @author Ame
 */
public class Ex38 {
    
    static void sumMax(int[][] matrix) {
        
        int maxSum = 0;
        int maxRow = 0;
        int maxRowSize = 0;        
                
        for (int i = 0; i < matrix.length; i++) {
            
            int sumRow = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumRow += matrix[i][j];
                
            }
            
            if (sumRow > maxSum) {
                maxSum = sumRow;
                maxRow = i+1;              
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            
            int sumRow = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumRow += matrix[i][j];
                
            }
            
            if (sumRow == maxSum) {
                maxRowSize++;             
            }
        }
        
        int[] maxRowList = new int[maxRowSize];
        int m = 0;
        for (int i = 0; i < matrix.length; i++) {
            
            int sumRow = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumRow += matrix[i][j];
                
            }
            
            if (sumRow == maxSum) {
                maxRowList[m] = i+1;
                m++;
            }
        }
        

        
        System.out.println("Max Sum: " + maxSum);
        System.out.println("Max Row: " + maxRow);
        System.out.println("Max Row List: " + Arrays.toString(maxRowList));
        
   
        
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
            {4, 5, -6, 11},
            {13, 14, 15, 16},
            {7, 8, 9, 12},
            {13, 14, 15, 16}
            
        };

        printMatrix(matrix);
        sumMax(matrix);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/* Nhập ma trận n hàng, m cột (n > 0, m > 0). Kiểm tra ma trận có toàn dương hay không
 *
 * @author Ame
 */
public class Ex37 {
    
    static boolean isPositive(int[][] matrix) {
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    return false;
                }
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
        
        if (isPositive(matrix)) {
            System.out.println("All Pos!");
        } else {
            System.out.println("Not completely!");
        }
    }

    public static void main(String[] args) {

        int matrix[][] = {
            {1, 2, 3, 10},
            {4, 5, -6, 11},
            {7, 8, 9, 12},
            {13, 14, 15, 16}
        };

        printMatrix(matrix);
    }
}

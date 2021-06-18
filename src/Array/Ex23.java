/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Dịch trái xoay vòng k lần trong mảng

 *
 * @author Ame
 */
public class Ex23 {
    static void rotateLeftArray(int[] array, int k) {
        
        for (int i = 0; i < k; i++) {
            int j, last;
            last = array[array.length - 1];
            for (j = array.length - 1; j > array.length - 1; j--) {
                array[j] = array[j - 1];
            }
            array[j] = last;
        }
        
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 3;
        
        rotateLeftArray(array, k);
    }
}

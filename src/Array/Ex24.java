/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Dịch phải xoay vòng k lần trong mảng
 *
 * @author Ame
 */
public class Ex24 {
    static void rotateArray(int[] array, int k) {
        
        for (int i = 0; i < k; i++) {
            int j, first;
            first = array[0];
            for (j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[j] = first;
        }
        
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 7;
        
        rotateArray(array, k);
    }
}

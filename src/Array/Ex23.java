/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Dịch trái xoay vòng k lần trong mảng

 *
 * @author Ame
 */
public class Ex23 {
    static int[] rotateLeftArray(int[] array, int k) {
        int[] tmp = new int[array.length];
        k = k % array.length;
        
        for (int i = 0; i < array.length; i++) {
            int j = i - k;
            if (j < 0) {
                j = array.length + j;
            }
            tmp[j] = array[i];
        }
        
        return tmp;
        
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 2;
        
        
        int[] newArr = rotateLeftArray(array, k);
        
        System.out.println(Arrays.toString(newArr));
    }
}

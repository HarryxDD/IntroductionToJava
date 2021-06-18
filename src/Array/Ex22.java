/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Đảo ngược mảng ban đầu

 *
 * @author Ame
 */
public class Ex22 {

    static void reverseArray(int[] array) {
        
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 2, 6, 10, 8, 9, 4};
        
        reverseArray(array);
    }
}

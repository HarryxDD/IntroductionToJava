/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0).  Kiểm tra mảng có đối xứng hay không!
Ví dụ:
int [] a = { 1, 2, 3 ,3 2,1} → mảng đối xứng
int [] b = { 1, 2, 3, 3,1} → Mảng không đối xứng

 *
 * @author Ame
 */
public class Ex27 {
    
    static boolean isSymmetry(int[] array) {
        
        int r = 0;
        int l = array.length - 1;
        
        for (int i = 0; i < array.length; i++) {
            if (array[r++] != array[l--]){
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 3, 2, 1};
        
        System.out.println(isSymmetry(array));
        
    }
}

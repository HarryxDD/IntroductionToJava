/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Tạo mảng b chỉ chứa giá trị lẻ từ mảng a

 *
 * @author Ame
 */
public class Ex25 {
    
    static int[] oddArr(int[] array){
        
        int oddSize = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddSize++;
            }
        }
        int[] oddArr = new int[oddSize];
        
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddArr[j] = array[i];
                j++;
            }
            
        }
        
        
        return oddArr;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        int[] newArr = oddArr(array);   

        
        System.out.println(Arrays.toString(newArr));
    }
}

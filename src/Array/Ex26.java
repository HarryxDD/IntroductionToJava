/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Tạo mảng b chỉ chứa số nguyên tố từ mảng a

 *
 * @author Ame
 */
public class Ex26 {
    
    static boolean isPrimeNum(int n) {
        if (n < 2) {
            return false;
        }
        
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    static int[] primeArr(int[] array){
        
        int primeSize = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNum(array[i])) {
                primeSize++;
            }
        }
        int[] primeArr = new int[primeSize];
        
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNum(array[i])) {
                primeArr[j] = array[i];
                j++;
            }
            
        }
        
        
        return primeArr;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        int[] newArr = primeArr(array);   

        
        System.out.println(Arrays.toString(newArr));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). 
Sắp xếp số nguyên tố tăng dần nhưng giá trị khác giữ nguyên vị trí

 *
 * @author Ame
 */
public class Ex15 {
    
    static int inputInt() {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        
        while (n <= 0) {
            System.out.println("Input n: ");
            String str = sc.nextLine();
            
            try {
                n = Integer.parseInt(str);
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e);
            }
        }
        
        return n;
    }
    
    static int[] inputArr() {
        int n = inputInt();
        Scanner sc = new Scanner(System.in);
        
        int[] array = new int[n];
        
        for(int i = 0; i < n; i++) {
            System.out.print("Num " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        
        return array;
    }
    
    static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
    
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
    
    static void sortPrimeNum() {
        int[] array = inputArr();
        
        int primeSize = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNum(array[i])){
                primeSize++;
            }
        }
        
        int p = 0;
        int[] primeArr = new int[primeSize];
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNum(array[i])){
                primeArr[p++] = array[i];
            }
        }
        
        bubbleSort(primeArr);

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNum(array[i])){
                array[i] = primeArr[j];
                j++;
            }
        }
        
        System.out.println(Arrays.toString(array));
        
    }
    
    public static void main(String[] args) {
        sortPrimeNum();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Liệt kê các phần tử là số nguyên tố

 *
 * @author Ame
 */
public class Ex4 {
    
    static int inputInt() {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        
        while (n <= 0) {
            System.out.print("Input n: ");
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
    
    static void inputArray() {
        Scanner sc = new Scanner(System.in);
        
        int n = inputInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("num " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        
        
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNum(array[i])) {
                System.out.print("Prime Num: " + array[i] + "\t");
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
        
    static void outputArray() {        
         inputArray();
    }
    
    public static void main(String[] args) {
        outputArray();
    }
    
    
    
}

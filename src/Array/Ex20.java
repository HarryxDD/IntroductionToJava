/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Xóa tất cả các số nguyên tố trong mảng

 *
 * @author Ame
 */
public class Ex20 {
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

    static int[] inputArray() {
        Scanner sc = new Scanner(System.in);

        int n = inputInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("num " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        return array;
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
    
    static void deleteArray() {
        int[] array = inputArray();

        int prime = 0;
        int primeSize = array.length;
        
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNum(array[i])) {
                primeSize--;
            }
        }
        
        int[] newArr = new int[primeSize];

        
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNum(array[i]) == false) {
                newArr[j++] = array[i]; 
            }
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        deleteArray();
    }
}

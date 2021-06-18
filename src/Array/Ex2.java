/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). In ra mảng vừa nhập và tổng các phần tử chẵn của mảng

 *
 * @author Ame
 */
public class Ex2 {
    
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
    
    static int [] inputArray() {
        
        Scanner sc = new Scanner(System.in);
        
        int num = inputInt();
        
        int[] array = new int[num];
        
        for (int i = 0; i < num; i++) {
            System.out.print("[" + i +"]: ");
            array[i] = sc.nextInt();
        }
        
        return array;
    }
    
    static void outputArray() {
        
        int[] numArr = inputArray();
        
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                sum += numArr[i];
            }
        }
                
        System.out.println("Array: " + Arrays.toString(numArr));
        System.out.println("sum: " + sum);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        outputArray();
        
    }
}

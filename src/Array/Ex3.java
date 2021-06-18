/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0).
    Liệt kê các vị trí mà giá trị tại đó là giá trị âm trong mảng 1 chiều.
 *
 * @author Ame
 */
public class Ex3 {
    
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

        for (int i = 0; i < n; i++){
            System.out.print("num " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        
        return array;
    }
    
    static void outputArray() {
        int[] array = inputArray();
        
        
 
        System.out.print("com < 0:\t");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.print(i + "\t");
            }
        }
    }
    
    public static void main(String[] args) {
        outputArray();
    }
}

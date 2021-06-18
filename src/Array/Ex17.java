/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). 
Thêm 1 phần tử x vào mảng tại vị trí k

 *
 * @author Ame
 */
public class Ex17 {
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
    
    static void addElement(int arr[], int x, int k) {
        int i;
        int[] newArr = new int[arr.length+1];
        
        for (i = 0; i < arr.length+1; i++) {
            if (i < k - 1)
                newArr[i] = arr[i];
            else if (i == k - 1)
                newArr[i] = x;
            else 
                newArr[i] = arr[i - 1];
            
        }
        
        System.out.println(Arrays.toString(newArr));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
            int x = sc.nextInt();
        System.out.print("\t k: ");
            int k = sc.nextInt();
        
        addElement(inputArray(), x, k);
    }
}

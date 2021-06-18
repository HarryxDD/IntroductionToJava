/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Xóa tất cả các số âm trong mảng
 *
 * @author Ame
 */
public class Ex19 {
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

    static void deleteArray() {
        int[] array = inputArray();

        int odd = 0;
        int oddSize = array.length;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                oddSize--;
            }
        }
        
        int[] newArr = new int[oddSize];

        
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                newArr[j++] = array[i]; 
            }
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        deleteArray();
    }
}

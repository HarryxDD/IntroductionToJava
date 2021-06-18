/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). 
Hãy xóa tất cả số lớn nhất trong mảng các số thực

 *
 * @author Ame
 */
public class Ex18 {

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

        int great = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > great) {
                great = array[i];
            }
        }
        
        int countMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == great) {
                countMax++;
            }
        }
        
        int newArrSize = array.length - countMax;
        int[] newArr = new int[newArrSize];

        
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != great) {
                newArr[j++] = array[i]; 
            }
        }
        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        deleteArray();
    }
}

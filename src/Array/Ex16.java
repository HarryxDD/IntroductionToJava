/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). 
Sắp xếp số dương tăng dần, âm giảm dần. Vị trí tương đối không thay đổi

 *
 * @author Ame
 */
public class Ex16 {
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

    static void oddArr(int[] array) {

        int oddSize = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddSize++;
            }
        }
        
        int evenSize = array.length - oddSize;

        int[] oddArr = new int[oddSize];
        int[] evenArr = new int[evenSize];
 
        int o = 0;
        int e = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddArr[o++] = array[i];
            }
            if (array[i] % 2 == 0) {
                evenArr[e++] = array[i];
            }
        }
        
        
                
        quickSort(oddArr, 0, oddArr.length - 1);
        
        for(int i = 0; i < oddSize/2; i++) {
            int temp = oddArr[i];
            oddArr[i] = oddArr[oddSize-1-i];
            oddArr[oddSize-1-i] = temp;
        }
        
        quickSort(evenArr, 0, evenArr.length - 1);

        
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {

                array[i] = oddArr[j];
                j++;
            }
            
        }
        
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = evenArr[k];
                k++;
            }
        }

        System.out.println(Arrays.toString(array));
        
    }

    static void quickSort(int[] arr, int start, int end) {

        int partition = partition(arr, start, end);

        if (partition - 1 > start) {
            quickSort(arr, start, partition - 1);
        }

        if (partition + 1 < end) {
            quickSort(arr, partition + 1, end);
        }

    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];

        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            }
        }

        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;
    }

    public static void main(String[] args) {
        oddArr(inputArray());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). 
Sắp xếp lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí

 *
 * @author Ame
 */
public class Ex14 {

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

//        int oddSize = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                oddSize++;
//            }
//        }
//
//        int[] oddArr = new int[oddSize];
//
//        int o = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                oddArr[o++] = array[i];
//                
//            }
//        }
//        
//        quickSort(oddArr, 0, oddArr.length - 1);
//        
//        int j = 0;
//        for (int i = 0; i < array.length; i++) {
//
//            if (array[i] % 2 != 0) {
//
//                array[i] = oddArr[j];
//                j++;
//            }
//        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                for(int j = i + 1; j < array.length; j++) {
                    if(array[j] % 2 != 0) {
                        if(array[i] > array[j]) {
                            int temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }
        }

        System.out.println(Arrays.toString(array));

    }

//    static void quickSort(int[] arr, int start, int end) {
//
//        int partition = partition(arr, start, end);
//
//        if (partition - 1 > start) {
//            quickSort(arr, start, partition - 1);
//        }
//
//        if (partition + 1 < end) {
//            quickSort(arr, partition + 1, end);
//        }
//
//    }
//
//    static int partition(int[] arr, int start, int end) {
//        int pivot = arr[end];
//
//        for (int i = start; i < end; i++) {
//            if (arr[i] < pivot) {
//                int temp = arr[start];
//                arr[start] = arr[i];
//                arr[i] = temp;
//                start++;
//            }
//        }
//
//        int temp = arr[start];
//        arr[start] = pivot;
//        arr[end] = temp;
//
//        return start;
//    }

    public static void main(String[] args) {
        oddArr(inputArray());
    }
}

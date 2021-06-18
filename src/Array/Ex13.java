/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Sắp xếp mảng giảm dần

 *
 * @author Ame
 */
public class Ex13 {

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
        
        int[] array = new int[n];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            System.out.print("Num " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
                
        return array;
    }
    
    static void quickSort(int[] arr, int start, int end) {
        int partition = partition(arr, start, end);
        
        if (partition - 1 > start) {
            quickSort(arr,start,partition - 1);
        }
        if (partition + 1 < end) {
            quickSort(arr,partition + 1, end);
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

    static void output() {
        int[] array = inputArr();
        
        quickSort(array, 0, array.length - 1);
        
        for(int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        
        System.out.println(Arrays.toString(array));
    }
    
    public static void main(String[] args) {
        output();
    }
}

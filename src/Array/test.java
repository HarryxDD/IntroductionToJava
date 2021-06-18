/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author Ame
 */
public class test {

    static int[] Input(int n) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[n];

        System.out.println("Input");
        for (int i = 0; i < n; i++) {
            System.out.printf("[%d] = ", i);
            array[i] = sc.nextInt();
        }
        return array;
    }

    static void printArray(int[] array) {
        System.out.print("Output");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);
        }
    }

    static void sort(int[] array) {
        int max;

        System.out.print("After sort:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] % 2 != 0) {
                        if (array[i] > array[j]) {
                            max = array[i];
                            array[i] = array[j];
                            array[j] = max;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("  " + array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] array;

        do {
            System.out.print("Enter n: ");
            n = sc.nextInt();
        } while (n <= 0);

        array = Input(n);
        printArray(array);
        System.out.println();
        sort(array);
        System.out.println();
    }
}

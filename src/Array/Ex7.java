/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Tìm giá trị lớn nhất trong mảng.

 *
 * @author Ame
 */
public class Ex7 {

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

        Scanner sc = new Scanner(System.in);
        int n = inputInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Num " + i + ": ");
            array[i] = sc.nextInt();
        }

        return array;

    }

    static int greatNum() {
        int[] array = inputArr();

        int great = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > great) {
                great = array[i];
            }
        }

        return great;
    }

    static void output() {
        System.out.println("great num: " + greatNum());
    }

    public static void main(String[] args) {
        output();
    }
}

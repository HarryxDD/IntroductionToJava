/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Liệt kê các phần tử là số hoàn hảo
 *
 * @author Ame
 */
public class Ex5 {

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

    static void inputArr() {

        Scanner sc = new Scanner(System.in);
        int n = inputInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Num " + i + ": ");
            array[i] = sc.nextInt();
        }
        
        for (int i = 0; i < array.length; i++) {
            if(isPerfectNum(array[i])){
                System.out.println("perfect");
            } else {
                System.out.println("not perfect");
            }
        }

    }

    static boolean isPerfectNum(int n) {

        int sum = 0;

        int i = 1;
        while (i < n) {
            if (n % i == 0) {
                sum += i;
            }
            i++;
        }

        if (sum != n) {
            return false;
        }

        return true;
    }
    
    static void output() {
        inputArr();
    }

    public static void main(String[] args) {
        output();
    }
}

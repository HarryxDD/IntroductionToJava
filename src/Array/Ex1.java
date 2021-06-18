/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). In ra mảng vừa nhập và tổng các phần tử lẻ của mảng

 *
 * @author Ame
 */
public class Ex1 {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = inputInt();
        
        //Khoi tao mang
        int[] array = new int[n];
        
        //Nhap phan tu
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        
        //In mang vua nhap
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + i + "]: " + array[i] + "\t");
        }
        
        //Tong cac phan tu le
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
            }
        }
        System.out.println("Tong cac phan tu le: " + sum);
    }
}

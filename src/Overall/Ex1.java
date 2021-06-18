/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Nhập số nguyên n > 1. Tính S =1^2 + 2^2 + 3^2 + ... + n^2 
 *
 * @author Ame
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n > 1: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("n phai n > 1");
        } else {
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += i * i;
            }
            System.out.println("S = " + sum);
        }
    }
}

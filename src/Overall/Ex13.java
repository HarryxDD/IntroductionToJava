/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Liệt kê tất cả các “ước số lẻ” của số nguyên dương n (n > 0)
 *
 * @author Ame
 */
public class Ex13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n > 0: ");
        int n = sc.nextInt();

        int i = 1;
        int divisor;

        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                divisor = n / i;
                if (divisor % 2 != 0) {
                    if (divisor != i) {
                        System.out.println(divisor + " " + i + " " + Math.sqrt(n));
                    }
                } else if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
            i++;
        }

    }
}

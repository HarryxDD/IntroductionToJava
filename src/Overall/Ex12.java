/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Đếm số lượng “ước số” của số nguyên dương n (n > 0)
 *
 * @author Ame
 */
public class Ex12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n > 0: ");
        int n = sc.nextInt();

        int i = 1;
        int divisor = 1;
        int count = 0;

        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                divisor = n / i;
                count += 2;
            }
            i++;
        }
        if (Math.sqrt(n) == (int) Math.sqrt(n)) {
            count = count - 1;
        }

        System.out.println(count);
    }
}

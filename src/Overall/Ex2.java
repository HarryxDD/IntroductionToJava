/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Nhập số nguyên n > 0. Tính S = 1 + 1/2 + 1/3 + … + 1/n
 *
 * @author Ame
 */
public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n > 0: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("n phai n > 0");
        } else {
            float sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += (float) 1 / i;
            }
            System.out.println("S = " + sum);
        }
    }
}

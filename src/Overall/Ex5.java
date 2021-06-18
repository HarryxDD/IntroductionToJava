/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Nhập số nguyên n (0 < n <= 10). Tính S = 1 + 1.2 + 1.2.3 + 1.2.3.4 + … + 1.2.3...n
 *
 * @author Ame
 */
public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n > 0 va <= 10: ");
        int n = sc.nextInt();

        if ((n < 0) || (n > 10)) {
            System.out.println("n phai lon hon 0 va nho hon hoac bang 10");
        } else {
            int temp = 1;
            int sum = 0;
            int i = 1;

            while (i <= n) {
                temp *= i;
                sum += temp;
                i++;
            }
            System.out.println("S = " + sum);
        }
    }
}

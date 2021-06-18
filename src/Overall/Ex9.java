/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/**
 *
 * @author Ame
 */
public class Ex9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n > 0: ");
        int n = sc.nextInt();

        int i = 1;
        int divisor;

        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                divisor = n / i;
                if (divisor == i) {
                    System.out.println(i);
                } else {
                    System.out.println(i + " " + divisor);
                }
            }
            i++;
        }

    }
}

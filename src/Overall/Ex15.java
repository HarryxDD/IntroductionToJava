/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Tính tích tất cả các “ước số lẻ” của số nguyên dương n (n > 0)

 *
 * @author Ame
 */
public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n > 0: ");
        int n = sc.nextInt();
        
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i % 2 != 0) {
                    sum *= i;
                }
            }
        }
        
        System.out.println(sum);
    }
}

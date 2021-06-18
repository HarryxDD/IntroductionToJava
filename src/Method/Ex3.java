/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/* Viết hàm tính tổng tất cả các “ước số” của số nguyên dương n (n > 0)

 *
 * @author Ame
 */
public class Ex3 {
    static int divSum(int n) {
        int i = 1;
        int divisor;
        int sum = 0;

        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                divisor = n / i;
                sum += divisor + i;
            }
            i++;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.println("Nhap n: ");
            n = sc.nextInt();
        }
        
        System.out.println(divSum(n));
    }
}

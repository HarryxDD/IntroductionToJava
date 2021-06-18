/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Liệt kê tất cả các số nguyên tố nhỏ hơn n
 *
 * @author Ame
 */
public class Ex38 {

    public static boolean checkPrimeNum(int n) {
        if (n < 2) {
            return false;
        }
        int sqRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= sqRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        
        if (n >= 2) { 
            System.out.println(2);
        }
        
        for (int i = 3; i < n; i+=2) {
            if (checkPrimeNum(i)) {
                System.out.println(i);
            }
        }
        
    }
}

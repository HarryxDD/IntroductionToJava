/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/* Nhập số nguyên n (0 < n <= 10). Viêt hàm tính S = 1 + 1.2 + 1.2.3 + 1.2.3.4 + … + 1.2.3...n
 *
 * @author Ame
 */
public class Ex2 {
    static int sum(int n) {
        
        int temp = 1;
            int sum = 0;
            int i = 1;

            while (i <= n) {
                temp *= i;
                sum += temp;
                i++;
            }
        return sum;
    }
    
    public static void main(String[] args) {
        
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n <= 0 || n > 10) {
            System.out.println("Nhap n > 1: ");
            n = sc.nextInt();
        }
        
        ans = sum(n);
        
        System.out.println(ans);
        
    }
}

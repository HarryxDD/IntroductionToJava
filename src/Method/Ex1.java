/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/* Nhập số nguyên n > 1. Viết hàm tính S =1^2+2^2 + 3^2 + ... + n^2 
 *
 * @author Ame
 */
public class Ex1 {
    static int sum(int i) {
        
        int sum = 0;
        sum += i*i;
        
        return sum;
    }
    
    public static void main(String[] args) {
        
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n <= 1) {
            System.out.println("Nhap n > 1: ");
            n = sc.nextInt();
        }
        
        for(int i = 0; i <= n; i++) {
            ans += sum(i);
        }
        
        System.out.println("Sum: " + ans);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Scanner;

/** Nhap 1 so nguyen, xuat tong tu 1 den n
 *
 * @author Ame
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sumWhile = 0;
        
        System.out.println("Num: ");
        n = sc.nextInt();
        
        int i = 0;
        while (i <= n) {
            sumWhile += i;
            i++;
        }
        
        System.out.println("Sum while: " + sumWhile);
        
        int sumDoWhile = 0;
        i = 0;
        
        do {
            sumDoWhile += i;
            i++;
        } while (i <= n);
        
        System.out.println("Sum Do While: " + sumDoWhile);
        
        int sumFor = 0;
        
        for (i = 0; i <= n; i++) {
            sumFor += i;
        }
        
        System.out.println("Sum For: " + sumFor);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Scanner;

/** Nhap vao so n, tinh giai thua
 *
 * @author Ame
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Num: ");
        n = sc.nextInt();
        
        int i = 0; 
        
        int sumWhile = 1;
        System.out.println("While: ");
        while (i < n) {
            i++;
            sumWhile *= i;
        }
        System.out.println("n! = " + sumWhile);
        
        i = 0;
        
        int sumDoWhile = 1;
        System.out.println("Do While: ");
        do {
            i++;
            sumDoWhile *= i;
        } while (i < n);
        System.out.println("n! = " + sumDoWhile);
        
        int sumFor = 1;
        System.out.println("For: ");
        for (i = 1; i <= n; i++) {
            sumFor *= i;
        }
        System.out.println("n! = " + sumFor);
    }
}

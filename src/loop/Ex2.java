/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Scanner;

/** Nhap 1 so nguyen n, xuat tong cac so le tu 1 -> n
 *
 * @author Ame
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Num: ");
        n = sc.nextInt();
        
        int i = 0;
        
        int sumWhile = 0;
        while ( i <= n ) {
            if ( i % 2 != 0) {
                sumWhile += i;
            }
            i++;
        }
        
        System.out.println("Sum While: " + sumWhile);
        
        i = 0;
        
        int sumDoWhile = 0;
        do {
            if ( i % 2 != 0) {
                sumDoWhile += i;
            }
            i++;
        } while ( i <= n );
        
        System.out.println("Sum Do While: " + sumDoWhile);
        
        int sumFor = 0;
        for (i = 0; i <= n ; i++) {
            if ( i % 2 != 0 ) {
                sumFor += i;
            }
        }
        
        System.out.println("Sum: " + sumFor);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Scanner;

/** Nhap vao so nguyen n, in ra tong so chan va so le nho hon hoac bang n
 *
 * @author Ame
 */
public class Ex3 {
    static void evenNumber(int i, int n){
        int sumEWhile = 0;
        
        while (i <= n) {
            if ( i % 2 == 0 ) {
            sumEWhile += i;
            }
            i++;
        }
        
        System.out.println("Even While: " + sumEWhile);
        
        i = 0;
        
        int sumEDoWhile = 0;
        do {
            if ( i % 2 == 0 ) {
                sumEDoWhile += i;
            }
            i++;
        } while ( i <= n );
        
        System.out.println("Even Do While: " + sumEDoWhile);
        
        int sumEFor = 0;
        for (i = 0; i <= n; i++){
            if ( i % 2 == 0 ) {
                sumEFor += i;
            }
        }
        
        System.out.println("Even For: " + sumEFor);
    }
    
    static void oddNumber(int i, int n){
        int sumOWhile = 0;
        
        
        while (i <= n) {
            if ( i % 2 != 0 ) {
            sumOWhile += i;
            }
            i++;
        }
        
        System.out.println("Odd While: " + sumOWhile);
        
        i = 0;
        
        int sumODoWhile = 0;
        do {
            if ( i % 2 != 0 ) {
                sumODoWhile += i;
            }
            i++;
        } while ( i <= n );
        
        System.out.println("Odd Do While: " + sumODoWhile);
        
        int sumOFor = 0;
        for (i = 0; i <= n; i++){
            if ( i % 2 != 0 ) {
                sumOFor += i;
            }
        }
        
        System.out.println("Odd For: " + sumOFor);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Num: ");
        n = sc.nextInt();
        
        int i = 0;
        
        evenNumber(i, n);
        oddNumber(i, n);
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Scanner;

/** Nhap vao so nguyen n, in ra bang cuu chuong
 *
 * @author Ame
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Num: ");
        n = sc.nextInt();
        
        int i = 0;
        System.out.println("While: ");
        while (i < 10) {
            i++;
            System.out.println(n + " x " + i + " = " + n*i);
        }
        
        i = 0;
        System.out.println("Do While: ");
        do {
            i++;
            System.out.println(n + " x " + i + " = " + n*i);
        } while (i < 10);
        
        System.out.println("For: ");
        for (i = 0; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        float sum = 0;
        if (n <= 0 || n > 10) { 
            System.out.println("0 < n <= 10");
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    sum += 1/((2.0*i)-1);
                } else {
                    sum -= 1/((2.0*i)-1);
                }
            }
            
            System.out.println(sum);
        }
        
    }
}

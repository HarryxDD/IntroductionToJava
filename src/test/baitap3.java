/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Ame
 */
public class baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so: ");
        int n = sc.nextInt();
        
        boolean check = true;
        
        while (n > 0) {
            int num2 = n % 10;
            int num1 = (n / 10) % 10;
            
            if (num2 != 2 && num2 != 3 && num2 != 5 && num2 != 7) {
                check = false;
            }
            if (num2 - num1 <= 0) {
                check = false;
            }
            if (!check) {
                System.out.println("false");
                break;
            }
            n/=10;
        }
        if (check) {
            System.out.println("true");
        }
        
        
    }
}

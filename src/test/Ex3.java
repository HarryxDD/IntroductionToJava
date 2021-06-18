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
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        
        boolean check = true;
        
        while (n > 0) {
            int num1 = n % 10;
            int num2 = (n/10) % 10;
            
            if (num1 != 2 && num1 != 3 && num1 != 5 && num1 != 7){
                check = false;
            }
            if (num1 - num2 < 0) {
                check = false;
            }
            if (!check) 
            {
                System.out.println("NO");
                break;
            }
            n/=10;
        }
        
        if (check) {
            System.out.println("YES");
        } 
    }
}

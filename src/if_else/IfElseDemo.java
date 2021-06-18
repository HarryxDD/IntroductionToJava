/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/**
 *
 * @author Ame
 */
public class IfElseDemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Number: ");
        n = sc.nextInt();
        
        if (n % 2 == 0) {
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is odd number");
        }
        
        
        // phuong trinh bac 2
        System.out.println("ax + b = 0");
        int a, b;
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("VSN");
            } else {
                System.out.println("VN");
            }
        } else {
            System.out.println("x = " + -b*1.0f/a);
        }
        
    }
}

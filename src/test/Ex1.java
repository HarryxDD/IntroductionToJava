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
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 15 == 0) {
                sum += i;
            }
        }
        
        System.out.println(sum);
    }
}

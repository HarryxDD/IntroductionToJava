/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/**
 *
 * @author Ame
 */
public class Ex7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 1 so tu 1 -> 5: ");
        int n;

        do {
            n = sc.nextInt();

            if (-1 < n && n < 6) {
                if (n == 1) {
                    System.out.println("Dien tich hinh chu nhat");
                }
                if (n == 2) {
                    System.out.println("Dien tich hinh tam giac");
                }
                if (n == 3) {
                    System.out.println("Dien tich hinh vuong");
                }
                if (n == 4) {
                    System.out.println("Dien tich hinh tron");
                }
                if (n == 5) {
                    System.out.println("Dien tich hinh thang");
                }
                if (n == 0) {
                    System.out.println("Ket thuc");
                    break;
                }
            } else {
                break;
            }
        } while (-1 < n && n < 6);
    }
}

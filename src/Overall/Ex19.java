/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Cho số nguyên dương n. Kiểm tra xem n có phải là số nguyên tố hay không

 *
 * @author Ame
 */
public class Ex19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n > 1: ");
        int n = sc.nextInt();

        int count = 0;
        int i = 2;
        
        
        while ( i < n ) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }
        
        if (count == 0) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }
    }

}

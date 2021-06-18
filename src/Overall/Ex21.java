/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Nhập số nguyên n. Hãy đếm số lượng chữ số của số nguyên dương n (n > 0)

 *
 * @author Ame
 */
public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        
        int count = 0;
        
        while (n > 0) {
            n /= 10;
            count++;
        }
        
        System.out.println(count);
    }
}

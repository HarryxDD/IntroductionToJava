/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/* Viết một chương trình nhập 3 số nguyên và tìm giá trị nhỏ nhất.
 *
 * @author Ame
 */
public class Ex9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Nhap a, b, c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        int n;
        
        if (a < b) {
            n = a;
            if (a < c){
                n = a;
            }
        } else {
            if (b < c) { 
               n = b;
            } else {
                n = c;
            }
        }
        
        System.out.println("So nho nhat la: " + n);
    }
}

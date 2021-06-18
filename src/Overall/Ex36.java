/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Viết chương trình nhập giá trị x sau tính giá trị của hàm số
f(x) = 2x^2 + 5x + 9 	nếu x >= 5
f(x) = -2x^2 + 4x – 9 	nếu x < 5

 *
 * @author Ame
 */
public class Ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = sc.nextInt();
        
        int f = 0;
        
        if ( x >= 5 ) {
            f = 2*x*x + 5*x + 9;
        } else {
            f = -2*x*x + 4*x - 9;
        }
        
        System.out.println(f);
    }
}

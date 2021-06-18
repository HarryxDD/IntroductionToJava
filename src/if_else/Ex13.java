/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/* Viết chương trình phải phương trình bậc 2: ax2 + bx + c = 0
Đầu vào: nhập 3 số a, b, c  (a, b, c là số bất kỳ)
Đầu ra: nghiệm của phương trình
Hướng dẫn: 
	Nếu a # 0 thì trở thành phương trình bậc 2 (chuẩn)
	Ngược lại, thì trở thành phương trình bậc nhất

 *
 * @author Ame
 */
public class Ex13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("ax^2 + bx + c = 0");
        
        System.out.print("a: ");
            a = sc.nextInt();
        System.out.print("b: ");
            b = sc.nextInt();
        System.out.print("c: ");
            c = sc.nextInt();
         
        if (a != 0) {
            int del = b*b - 4*a*c;
        
            if (del < 0) {
                System.out.println("PTVN");
            } else if (del == 0) {
                System.out.println("x = " + -b*1.0f/2*a);
            } else {
                System.out.println("x1 = " + (-b + Math.sqrt(del))/(2*a) + ", x2 = " + (-b - Math.sqrt(del))/(2*a));
            }
        } else {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("VSN");
                } else {
                    System.out.println("VN");
                }
            } else {
                System.out.println("x = " + -c*1.0f/b);
            }
        }
            
        
    }
}

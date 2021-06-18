/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/*

    Viết chương trình phải phương trình bậc 2: ax2 + bx + c = 0 (a # 0)
    Đầu vào: nhập 3 số a, b, c (a # 0) (Khai báo kiểu float)
    Đầu ra: nghiệm của phương trình
    Hướng dẫn: Sử dụng lớp Math.xxx() để sử dụng các hàm sẵn
	Ví dụ: Math.sqrt(123) tính căn bậc 2 của số 123	

 *
 * @author Ame
 */
public class Ex12 {
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
            
        int del = b*b - 4*a*c;
        
        if (del < 0) {
            System.out.println("PTVN");
        } else if (del == 0) {
            System.out.println("x = " + -b*1.0f/2*a);
        } else {
            System.out.println("x1 = " + (-b + Math.sqrt(del))/(2*a) + ", x2 = " + (-b - Math.sqrt(del))/(2*a));
        }
    }
}

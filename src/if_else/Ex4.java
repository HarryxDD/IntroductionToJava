/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/* Viết chương trình giải phương trình bậc nhất: ax + b = 0
    Đầu vào: nhập 2 số a, b (Khai báo kiểu float)
    Đầu ra: nghiệm của phương trình
 *
 * @author Ame
 */
public class Ex4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/* Viết chương trình nhập một số nguyên bất kỳ từ bàn phím và 
    in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 100
 *
 * @author Ame
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Number: ");
        n = sc.nextInt();
        
        if (n < 100) {
            System.out.println(n + " is less than 100");
        } else {
            System.out.println(n + " is greater than 100");
        }
    }
}

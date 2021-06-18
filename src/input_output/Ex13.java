/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.util.Scanner;

/* Viết chương trình tính biểu thức sau:
4(x^2 + 10x*sqrt(3) + 3x + 1)
Với x nhập vào từ bàn phím
 *
 * @author Ame
 */
public class Ex13 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("nhap x: ");
        int x = input.nextInt();
        
        System.out.println("Gia tri bieu thuc: " + (4 * (x * x + 10 * x * Math.sqrt(x) + 3 * x +1)));
    }
}

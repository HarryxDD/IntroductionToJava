/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.util.Scanner;

/* Viết chương trình tính biểu thức sau:
4sin(x) + cos(2x + ½)
Với x nhập vào từ bàn phím
 *
 * @author Ame
 */
public class Ex14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("nhap x: ");
        int x = input.nextInt();
        
        float bieuthuc = (float)(4*Math.sin(x) + Math.cos(2*x + 0.5));
        
        System.out.println("Gia tri bieu thuc: " + bieuthuc);
    }
}

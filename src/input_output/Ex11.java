/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.util.Scanner;

/* Viết chương trình tính giá trị biểu thức sau:
	3 - 5 + 6x + 5
	Với x được nhập vào từ bàn phím
 *
 * @author Ame
 */
public class Ex11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("nhap x: ");
        int x = input.nextInt();
        
        System.out.println("Gia tri bieu thuc: " + (3-5+6*x+5));
    }
}

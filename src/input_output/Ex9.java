/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.util.Scanner;

/* Nhập vào 2 số nguyên là 2 cạnh của hình chữ nhật. Tính diện tích hình chữ nhật.
Diện tích = chiều dài * chiều rộng
 *
 * @author Ame
 */
public class Ex9 {
    public static void main(String[] args) {
    
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap 2 canh hinh chu nhat: ");
            float a = input.nextFloat();
            float b = input.nextFloat();
            
            System.out.println("Dien tich la: " + a*b);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.util.Scanner;

/* Nhập vào 2 số thập phân là 2 cạnh của hình chữ nhật. Tính chu vi hình chữ nhật.
Chu vi  = (chiều dài + chiều rộng) * 2
 *
 * @author Ame
 */
public class Ex8 {
    public static void main(String[] args) {
    
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap 2 canh hinh chu nhat: ");
            float a = input.nextFloat();
            float b = input.nextFloat();
            
            System.out.println("Chu vi la: " + (a+b)*2);
    }

    
}

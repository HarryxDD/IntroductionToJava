/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.util.Scanner;

/* Nhập vào một số thập phân là bán kính hình tròn. Tính diện tích hình tròn.
Cho PI = 3.14
Diện tích = PI * bán kính * bán kính
 *
 * @author Ame
 */
public class Ex7 {
    public static void main(String[] args) {
        float PI = 3.14f;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        float a = input.nextFloat();
        
        System.out.println("Chu vi la: " + PI*a*a);
    }
}

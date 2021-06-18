/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.util.Scanner;

/* Nhập vào một số nguyên là bán kính hình tròn. Tính chu vi hình tròn
Cho PI = 3.14
Chu vi = 2 * bán kính * PI

 *
 * @author Ame
 */
public class Ex6 {
    public static void main(String[] args) {
        float PI = (float) 3.14;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        int a = input.nextInt();
        
        System.out.println("Chu vi la: " + 2*a*PI);
    }
}

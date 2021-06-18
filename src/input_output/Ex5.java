/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.util.Scanner;

/* Viết chương trình nhập vào 3 số nguyên, tính trung bình cộng 3 số đó

 *
 * @author Ame
 */
public class Ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap 3 so: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        float t = (float)(a + b + c) / 3;
        
        System.out.println("trung binh cong: " + t);
        
    }
}

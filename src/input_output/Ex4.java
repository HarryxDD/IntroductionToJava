/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.util.Scanner;

/* 	Viết chương trình nhập vào 2 số nguyên và in ra tổng, hiệu và phép nhân 2 số vừa nhập

 *
 * @author Ame
 */
public class Ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap 2 so nguyen: ");
        int a = input.nextInt();
        int b = input.nextInt();
        
        System.out.println("Tong: "+ (a + b));
        System.out.println("Hieu: "+ (a - b));
        System.out.println("Tich: "+ (a * b));


    }
}

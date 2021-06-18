/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Cho số nguyên dương n. Kiểm tra xem n có phải là số chính phương hay không
 *
 * @author Ame
 */
public class Ex20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();

        float num = (float) Math.sqrt(n);

        if (num == (int) num) {
            System.out.println("day la so chinh phuong");
        } else {
            System.out.println("day khong phai la so chinh phuong");
        }

    }
}

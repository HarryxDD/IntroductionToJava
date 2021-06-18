/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else.Switch;

import java.util.Scanner;

/* -------------------------TINH DIEN TICH--------------------------
	An 1. Dien tich hinh chu nhat
	An 2. Dien tich hinh tam giac
	An 3. Dien tich hinh vuong
	An 4. Dien tich hinh tron
	An 5. Dien tich hinh thang
	Chọn:
Mỗi chức năng nhập các hệ số tương ứng để thực hiện
	Ví dụ: Chọn: 1
	Chieu dai: 3
	Chieu rong: 4
	Dien tich hinh chu nhat la: 12

 *
 * @author Ame
 */
public class Ex3 {

    static void num_1(float le, float wi) {
        System.out.println("Dien tich la: " + le * wi);
    }

    static void num_2(float bo, float h) {
        System.out.println("Dien tich tam giac la: " + 0.5 * bo * 1.0f * h);
    }

    static void num_4(float r) {

        float PI = (float) 3.14;
        System.out.println("Dien tich hinh tron la: " + r * r * PI);
    }

    static void num_5(float bb, float sb, float hh) {
        System.out.println("Dien tich hinh thang la: " + (sb + bb) / 2 * hh);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap gia tu 1 toi 5: ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Dien tich hinh chu nhat");
                System.out.print("Nhap chieu dai: ");
                float length = sc.nextInt();
                System.out.print("Nhap chieu rong: ");
                float width = sc.nextFloat();

                num_1(length, width);
                break;

            case 2:
                System.out.println("Dien tich hinh tam giac");
                System.out.print("Nhap canh day: ");
                float bottom = sc.nextFloat();
                System.out.print("Nhap chieu cao: ");
                float height = sc.nextFloat();

                num_2(bottom, height);
                break;

            case 3:
                System.out.println("Dien tich hinh vuong");
                System.out.print("Nhap canh hinh vuong:  ");
                float side = sc.nextFloat();

                num_1(side, side);
                break;

            case 4:
                System.out.println("Dien tich hinh tron");
                System.out.print("Nhap ban kinh: ");
                float radius = sc.nextFloat();

                num_4(radius);
                break;

            case 5:
                System.out.println("Dien tich hinh thang");
                System.out.println("Nhap 2 canh day: ");
                float bigBot = sc.nextFloat();
                float smallBot = sc.nextFloat();
                System.out.println("Nhap chieu cao: ");
                float height2 = sc.nextFloat();

                num_5(bigBot, smallBot, height2);
                break;

            default:
                System.out.println("UNKNOWN");
        }
    }
}

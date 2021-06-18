/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else.Switch;

import java.util.Scanner;

/* Nhập tháng và năm. In ra màn hình tháng đó có bao nhiêu ngày. 
Ví dụ:
Nhập 3 ⇒ Thang 3 co 31 ngay
Nhap 13 ⇒ Khong co thang 13
Ghi chú: cách xác định năm nhuận: năm chia hết cho 4 và không chia hết cho 100, hoặc chia hết cho 400. 

 *
 * @author Ame
 */
public class Ex4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        int thang = sc.nextInt();
        System.out.println("Nhap nam: ");
        int year = sc.nextInt();
        
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + thang + " co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + thang + " co 30 ngay");
                break;
            case 2:
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    System.out.println("Thang " + thang + " co 29 ngay");
                } else {
                    System.out.println("Thang " + thang + " co 28 ngay");
                }
                break;
            default:
                System.out.println("Khong co thang " + thang);
        }
    }
}

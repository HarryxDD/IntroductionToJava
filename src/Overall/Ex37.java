/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Viết chương trình nhập ngày, tháng, năm. Tính xem ngày đó là ngày thứ bao nhiêu trong năm
 *
 * @author Ame
 */
public class Ex37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay, thang, nam: ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        
        
        System.out.println("Ngay " + d + " thang " + m + " nam " + y);
    }
}

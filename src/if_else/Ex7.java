/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/* Chương trình dự báo thời tiết dựa vào nhiệt độ và có tiêu chí sau:
Nhiệt độ < 10: thời tiết rất lạnh
Nhiệt độ 10-20: thời tiết lạnh
Nhiệt độ 20-30: thời tiết bình thường
Nhiệt độ 30-40: thời tiết nóng
Nhiệt độ >= 40: thời tiết rất nóng
Viết chương trình nhập vào nhiệt độ hiện tại. Thông báo cho người dùng biết là thời tiết đó như thế nào?

 *
 * @author Ame
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int degree;
        System.out.print("Degree: ");
        degree = sc.nextInt();
        
        if (degree >= 40) {
            System.out.println("Extremely hot");
        } else if (degree >= 30) {
            System.out.println("Hot");
        } else if (degree >= 20) {
            System.out.println("Normal");
        } else if (degree >= 10) {
            System.out.println("Cold");
        } else {
            System.out.println("Extremely cold");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/* Viết chương trình nhập vào một số nguyên là năm (ví dụ năm nay 2018). Kiểm tra số vừa nhập có phải là năm nhuận hay không? 
    Biết rằng năm nhuận là:
    Năm chia hết cho 4 nhưng không chia hết cho 100.
    Hoặc năm chia hết cho 400.

 *
 * @author Ame
 */
public class Ex5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Year: ");
        year = sc.nextInt();
        
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}

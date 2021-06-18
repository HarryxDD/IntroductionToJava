    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Nhập số nguyên n. Tìm chữ số lớn nhất của số nguyên dương n (n > 0)

 *
 * @author Ame
 */
public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();

        int great = 0;

        while (n > 0) {
            if ((n % 10) > great) {
                great = n % 10;
            }
            n /= 10;
        }

        System.out.println("so lon nhat la: " + great);
    }
}

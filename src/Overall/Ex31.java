/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Nhập số nguyên n. Hãy kiểm tra số nguyên dương n có toàn chữ số chẵn hay không
 *
 * @author Ame
 */
public class Ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = sc.nextInt();
        int count = 0;
        
        while (n > 0) {
            if ((n % 10) % 2 != 0) {
                count++;
            }
            n /= 10;
        }
        
        if (count == 0) {
            System.out.println("toan la so chan");
        } else {
            System.out.println("co so le");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Nhập n và in ra tam giác cân rỗng chiều cao n sau:
	Ví dụ n = 5
                    *
                 *     *
              *           *  
           *                 * 
        *  *  *  *  *  *  *  *  *

 *
 * @author Ame
 */
public class Ex48 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int m = n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(" ");
            }
            if (i == 1 || i == n) {
                for (int j = 1; j <= (2 * i) - 1; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j <= (2 * i) - 1 - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println("");
            m--;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Nhập n và in ra tam giác cân chiều cao n sau:
	Ví dụ n = 4
            *
         * * *
      * * * * *  
   * * * * * * * 

 *
 * @author Ame
 */
public class Ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int m = n - 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= (2*i - 1); j++) {
                System.out.print(" * ");
            }
            System.out.println("");
            m--;
        }
    }
}
    
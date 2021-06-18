/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Vẽ hình chữ nhật rỗng kích thước n x m
	Ví dụ n = 4, m = 5
		* * * * *
		*       *		
		*       *
		* * * * *

 *
 * @author Ame
 */
public class Ex44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n, m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
                if (i == 1 || i == n) {
                    for (int j = 1; j <= m; j++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                    for (int j = 1; j <= (m-2); j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            
            System.out.println("");
        }
    }
}

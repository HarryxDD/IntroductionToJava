/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Nhập n và in ra tam giác cân đặc chiều cao n sau
	Ví dụ n = 5
*
* *
* * *
* * * *
* * * * *

 *
 * @author Ame
 */
public class Ex45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhan n: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
        }
    }
}

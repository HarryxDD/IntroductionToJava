/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Nhập n và in ra tam giác cân rỗng chiều cao n sau
	Ví dụ n = 5
*
* *
*   *
*     *
* * * * *

 *
 * @author Ame
 */
public class Ex46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhan n: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
            } else { 
                System.out.print(" * ");
                for (int j = 1; j <= (i-2); j++) {
                    System.out.print("   ");
                }
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}

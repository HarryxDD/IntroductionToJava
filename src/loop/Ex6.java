/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Scanner;

/* Viết chương trình tính:
		n!! = 1 * 3 * 5 *… * n (nếu n lẻ)
                            = 2 * 4 * 6 * … *n (nếu n chẵn)
	Ví dụ: n = 7 → n!! = 1 * 3 * 5 * 7 = 105
		n = 6 → n!! = 2 * 4 * 6 = 48

 *
 * @author Ame
 */
public class Ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();

        int i;
        
        if (n % 2 == 0) {
            i = 2;
        } else {
            i = 1;
        }
        
        int fac = 1;
        int count = i;
        
        while (count <= n) {
            fac *= count;
            count += 2;
        }
        
        System.out.println("While: " + fac);
        
        fac = 1;
        for (count = i; count <= n; count += 2) {
            fac *= count;
        }
        
        System.out.println("For: " + fac);
        
        fac = 1;
        count = i;
        do {
            fac *= count;
            count += 2;
        } while (count <= n);
        
        System.out.println("Do While: " + fac);
    }
}

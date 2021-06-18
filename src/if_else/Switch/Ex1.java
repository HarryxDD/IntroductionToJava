/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else.Switch;

import java.util.Scanner;

/* Viết chương trình nhập số nguyên n (1 → 10) và in ra từ tiếng anh tương ứng
	Ví dụ: n = 3 → THREE
		n = 9 → NINE
		n = 11 → UNKNOWN
 *
 * @author Ame
 */
public class Ex1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen tu 1 -> 10: ");
        
        int n = sc.nextInt();
        
        switch (n) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            case 10:
                System.out.println("TEN");
                break;
            default:
                System.out.println("UNKNOWN");
        }
    }
}

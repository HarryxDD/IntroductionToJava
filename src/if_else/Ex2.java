/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/* Viết chương trình nhập vào một số kiểu số nguyên. In ra kết quả số đó là số dương hay số âm
 *
 * @author Ame
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Number: ");
        n = sc.nextInt();
        
        if (n < 0) {
            System.out.println(n + " is negative number");
        } else {
            System.out.println(n + " is positive number");
        }
    }
}

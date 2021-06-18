/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/* Nhập số nguyên n. Viết hàm tìm số đảo ngược của số nguyên dương n (n > 0)

 *
 * @author Ame
 */
public class Ex11 {
    static int reverseNum(int n){
        int newNum = 0;

        while (n > 0) {
            newNum = n % 10 + newNum * 10;
            n /= 10;
        }
        
        return newNum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.println("Nhap n: ");
            n = sc.nextInt();
        }
        
        System.out.println(reverseNum(n));
    }
}

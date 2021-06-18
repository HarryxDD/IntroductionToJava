/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/* Nhập số nguyên n. Viết hàm tìm chữ số nhỏ nhất của số nguyên dương n (n > 0)
 *
 * @author Ame
 */
public class Ex13 {
    static int smallNum(int n){
        int small = 10;

        while (n > 0) {
            if ((n % 10) < small) {
                small = n % 10;
            }
            n /= 10;
        }
        
        return small;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.println("Nhap n: ");
            n = sc.nextInt();
        }
        
        System.out.println(smallNum(n));
    }
}

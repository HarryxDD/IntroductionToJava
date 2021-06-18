/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/* Nhập số nguyên n. Viết hàm tìm chữ số lớn nhất của số nguyên dương n (n > 0)

 *
 * @author Ame
 */
public class Ex12 {
    static int greatNum(int n){
        int great = 0;

        while (n > 0) {
            if ((n % 10) > great) {
                great = n % 10;
            }
            n /= 10;
        }
        
        return great;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.println("Nhap n: ");
            n = sc.nextInt();
        }
        
        System.out.println(greatNum(n));
    }
}

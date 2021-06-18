/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/* Nhập số nguyên n. Viết hàm đếm số lượng chữ số lẻ của số nguyên dương n (n > 0)

 *
 * @author Ame
 */
public class Ex10 {
    static int oddNum(int n ){
        int count = 0;

        while (n > 0) {
            if (n % 2 != 0) {
                count++;
            }
            n /= 10;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.println("Nhap n: ");
            n = sc.nextInt();
        }
        
        System.out.println(oddNum(n));
    }
}

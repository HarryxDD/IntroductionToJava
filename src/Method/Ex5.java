/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/* Cho số nguyên dương n. Viết hàm kiểm tra xem n có phải là số hoàn hảo hay không. 
    Số hoàn hảo là số có tổng tất cả các ước bé hơn bé hơn n bằng chính nó. 
    Ví dụ 6 là số hoàn hảo, vì 6 có các ước là 1, 2, 3. Và tổng 1 + 2 +3 = 6

 *
 * @author Ame
 */
public class Ex5 {
    static void isPerfectNumber(int n) {
        int perfect = 0;
        int sum = 0;

        int i = 1;
        while (i < n) {
            if (n % i == 0) {
                sum += i;
            }
            i++;
        }

        if (sum == n) {
            System.out.println(n + " la so hoan hao");
        } else {
            System.out.println(n + " khong phai la so hoan hao");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        
        isPerfectNumber(n);
    }
}

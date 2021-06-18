/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/* Liệt kê tất cả các số chính phương nhỏ hơn n(Sử dụng hàm kiểm tra số chính phương)
 *
 * @author Ame
 */
public class Ex19 {
    static boolean checkSquareNum(int n) {
        float num = (float) Math.sqrt(n);
        return num == (int) num;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        
        for (int i = 1; i < n; i++) {
            if (checkSquareNum(i)) {
                System.out.println(i);
            }
        }
    }
}

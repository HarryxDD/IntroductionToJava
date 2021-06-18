/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Liệt kê tất cả các số chính phương nhỏ hơn n
 *
 * @author Ame
 */
public class Ex39 {
    public static boolean checkSquareNum(int n) {
        float num = (float) Math.sqrt(n);
        if (num != (int) num) {
            return false;
        }
        return true;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/* Nhập số nguyên n. Viết hàm kiểm tra số nguyên dương n có toàn chữ số lẻ hay không

 *
 * @author Ame
 */
public class Ex14 {
    static void oddNum(int n){
        int count = 0;
        
        while (n > 0) {
            if ((n % 10) % 2 == 0) {
                count++;
            }
            n /= 10;
        }
        
        if (count == 0) {
            System.out.println("toan la so le");
        } else {
            System.out.println("co so chan");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        
        oddNum(n);
    }
}

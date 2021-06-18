/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/* Nhập số nguyên n > 100. Viết hàm kiểm tra các chữ số của số nguyên dương n có giảm dần từ trái sang phải hay không

 *
 * @author Ame
 */
public class Ex17 {
    static boolean increaseNum(int n){
        boolean check = true;
        
        int temp = n%10;
        n /= 10;
        while(n > 0) {
            if(temp < n%10) {
                temp = n%10;
            }
            else {
                return false;
            }
            n /= 10;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        
        if(increaseNum(n)) {
            System.out.println("giam dan");
        } else {
            System.out.println("tang dan");
        }
    }
}

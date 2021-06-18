/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/* Nhập số nguyên n. Viết hàm kiểm tra các chữ số của số nguyên dương n có tăng dần từ trái sang phải hay không

 *
 * @author Ame
 */
public class Ex16 {
    static boolean increaseNum(int n){
        boolean check = true;
        
//        while (n > 0) {
//            int temp1 = n % 10;
//            int temp2 = n % 100 / 10;
//            System.out.println(temp1);
//            System.out.println(temp2);
//            if (temp2 - temp1 <= 0) {
//                check = true;
//                System.out.println("tang dan");
//            } else {
//                check = false;
//                System.out.println("giam dan");
//            }
//            n /= 10;
//        }
//        
//        return check;
        int temp = n%10;
        n /= 10;
        while(n > 0) {
            if(temp > n%10) {
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
            System.out.println("tang dan");
        } else {
            System.out.println("giam dan");
        }
    }
}

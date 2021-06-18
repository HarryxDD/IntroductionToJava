/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Nhập số nguyên n. Hãy kiểm tra các chữ số của số nguyên dương n có giảm dần từ trái sang phải hay không
 *
 * @author Ame
 */
public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        String n = sc.nextLine();
        
        boolean check = true;
        
        for (int i = 0; i < n.length() - 1; i++) {
            char temp1 = n.charAt(i);
            char temp2 = n.charAt(i + 1);
            
            if (temp1 - temp2 < 0) {
                check = false;
            }
        }
        
        if (check == true) { 
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

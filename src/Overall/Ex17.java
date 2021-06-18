/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Tìm ước số lẻ lớn nhất của số nguyên dương n. Ví dụ n = 100 ước lẻ lớn nhất là 25

 *
 * @author Ame
 */
public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n > 0: ");
        int n = sc.nextInt();
        
        int oGreater = 0;
        
        for(int i = 1; i <= n; i++){
            if (n % i == 0) {
                if (i % 2 != 0) {
                    if (i > oGreater) {
                        oGreater = i;
                    }
                }
            }
        }
        
        System.out.println(oGreater);
    }

}

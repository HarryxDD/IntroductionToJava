/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Nhập số nguyên N. Viết chương trình tìm số nguyên dương m lớn nhất sao cho 1 + 2 + … + m < N
 *
 * @author Ame
 */
public class Ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N: ");
        int n = sc.nextInt();
        
        int sum = 0;
        int m = 0;
        while (sum < n) {
            sum += m;
            m++;
        }
        System.out.println("m: " + (m - 1) + " n: " + n + " sum: " + sum);
    }
}

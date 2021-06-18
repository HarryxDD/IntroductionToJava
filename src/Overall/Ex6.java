/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/* Viết chương trình in ra tất cả các số lẻ nhỏ hơn 100 trừ các số 5, 7, 93
 *
 * @author Ame
 */
public class Ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        do {
            if (i == 5 || i == 7 || i == 93) {
                i++;
            } else {
                System.out.println(i);
                i++;
            }
        } while (i < 100);
    }
}

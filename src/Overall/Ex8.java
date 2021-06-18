/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

import java.util.Scanner;

/**
 *
 * @author Ame
 */
public class Ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a va b");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println("An 1: a x b");
        System.out.println("An 2: a / b");
        System.out.println("An 3: a + b");
        System.out.println("An 4: a - b");
        System.out.println("An 5: a % b");
        System.out.println("An 0: thoat");
        System.out.println("Chon: ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println(a * b);
                break;
            case 2:
                System.out.println(a / b);
                break;
            case 3:
                System.out.println(a + b);
                break;
            case 4:
                System.out.println(a - b);
                break;
            case 5:
                System.out.println(a % b);
                break;
            default:
                System.out.println("thoat");
        }

    }
}

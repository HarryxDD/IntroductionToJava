/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Scanner;

/**
 *
 * @author Ame
 */
public class ExceptionDemo {

    static int inputInt() {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            try {
                n = Integer.parseInt(str);
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.toString());
            }
        }
        
        return n;
    }
    
    public static void main(String[] args) {

        int n = 0;
        Scanner sc = new Scanner(System.in);

        //Input String --> Convert String ==> Number
        System.out.print("Input number: ");

//        while (true) {
//            String str = sc.nextLine();
//            try {
//                n = Integer.parseInt(str);
//                break;
//            } catch (Exception e) {
//                System.out.println("ERROR: " + e.toString());
//            }
//        }

        n = inputInt();

        System.out.println("Finish: " + n);
    }
}

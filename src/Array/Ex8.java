/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Tìm số chẵn cuối cùng trong mảng. 
Nếu mảng không có giá trị chẵn thì trả về -1

 *
 * @author Ame
 */
public class Ex8 {
    static int inputInt() {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        while (n <= 0) {
            System.out.println("Input n: ");
            String str = sc.nextLine();
            try {

                n = Integer.parseInt(str);
                break;

            } catch (Exception e) {
                System.out.println("ERROR: " + e);
            }
        }

        return n;
    }

    static int[] inputArr() {

        Scanner sc = new Scanner(System.in);
        int n = inputInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Num " + i + ": ");
            array[i] = sc.nextInt();
        }

        return array;

    }

    static int lastEven() {
        int[] array = inputArr();

        int lastEven = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                lastEven = array[i];
            }
        }

        return lastEven;
    }

    static void output() {
        System.out.println("last even: " + lastEven());
    }

    public static void main(String[] args) {
        output();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overall;

/* Tìm số nguyên dương n nhỏ nhất sao cho 1 + 2 + … + n > 10000

 *
 * @author Ame
 */
public class Ex34 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        for (n = 0; sum < 10000; n++) {
            sum += n;
        }
        System.out.println("n: " + (n - 1) + " sum: " + sum);
    }
}

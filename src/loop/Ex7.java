/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

/* Tạo bảng số như dưới
0	1	2	3	4	5	6	7	8	9
10	11	12	13	14	15	16	17	18	19
…
90	91	92	93	94	95	96	97	98	99

 *
 * @author Ame
 */
public class Ex7 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("While");
        while (i < 100) {
            System.out.printf("%-5s", i);
            i++;
            if ( i % 10 == 0 ) {
                System.out.println("");
            }
        }
        
        System.out.println("Do While");
        i = 0;
        do {
            System.out.printf("%-5s", i);
            i++;
            if ( i % 10 == 0 ) {
                System.out.println("");
            }
        } while (i < 100);
        
        System.out.println("For");
        for(i = 0; i < 100; i++) {
            System.out.printf("%-5s", i);
            if ( i % 10 == 9 ) {
                System.out.println("");
            }
        }
    }
}

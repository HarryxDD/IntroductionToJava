/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/* Điểm học phần của môn Tin học được tính như sau: chuyên cần (20%), giữa kỳ (30%), cuối kỳ (50%). 
    Và điểm học phần được xếp loại như sau:
điểm >=8.5		: Hạng A
7 <= điểm < 8.5	: Hạng B
5.5 <= điểm < 7	: Hạng C
4 <= điểm < 5.5	: Hạng D
điểm < 4		: Hạng F
	Viết chương trình nhập điểm môn Tin học và in ra cho người dùng biết điểm học phần môn này và xếp hạng gì?

 *
 * @author Ame
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mark;
        System.out.print("Mark: ");
        mark = sc.nextFloat();
        
        if (mark >= 8.5) {
            System.out.println("A");
        } else if (mark >= 7) {
            System.out.println("B");
        } else if (mark >= 5.5) {
            System.out.println("C");
        } else if (mark >= 4) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}

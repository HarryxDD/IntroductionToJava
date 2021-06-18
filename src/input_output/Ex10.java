/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.util.Scanner;

/* Nhập vào thông tin của một học sinh bao gồm: họ và tên, tuổi, địa chỉ, lớp, điểm toán, điểm lý, điểm hóa. Sau đó in ra màn hình thông tin vừa nhập và điểm trung bình các môn học:
	Điểm trung bình = (toán + lý + hóa)/3
 *
 * @author Ame
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        String name = input.nextLine();
        
        System.out.println("Nhap tuoi: ");
        int age = input.nextInt();
        
        input.nextLine();
        System.out.println("Nhap dia chi: ");
        String add = input.nextLine();
        
        System.out.println("Nhap lop: ");
        String classr = input.next();
        
        input.nextLine();
        System.out.println("Nhap diem toan ly hoa : ");
        float toan = (float)input.nextFloat();
        float ly = (float)input.nextFloat();
        float hoa = (float)input.nextFloat();
        
        System.out.println("Thong tin hoc sinh: ");
        System.out.println("Ten: " + name + ", Tuoi: " + age + ", Dia chi: " + add + ", Lop: " + classr +  ", Diem trung binh: " + (toan+ly+hoa)/3);
        
    }    
}

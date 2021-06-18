/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.util.Scanner;

/*
 * Viết chương trình nhập vào một chuỗi và in ra chuỗi vừa nhập
	Ví dụ: Nhập: Xin chào, Tôi tên là Trần Văn Nam!
		Chuỗi vừa nhập: Xin chào, Tôi tên là Trần Văn Nam!

 * @author Ame
 */
public class Ex3 {
    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap: ");
        String chuoi = input.nextLine();
        
        System.out.println("Chuoi vua nhap: " + chuoi);
    }
}

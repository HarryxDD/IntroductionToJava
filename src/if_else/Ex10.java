/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/* Bạn có thời gian rảnh và đi làm thêm cho một cửa hàng tạp hóa. Bạn được nhận tiền hoa hồng dựa vào doanh số bán hàng như sau:
5% nếu tổng doanh số nhỏ hơn hoặc bằng 100 triệu.
10% nếu tổng doanh số nhỏ hơn hoặc bằng 300 triệu.
20 % nếu tổng doanh số là lớn hơn 300 triệu.
	Viết chương trình nhập vào tổng doanh số bạn bán được và tính số tiền hoa hồng bạn nhận được.

 *
 * @author Ame
 */
public class Ex10 {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int DS,HH; 
       
        System.out.println("Nhap tong doanh so (trieu): ");
        DS = sc.nextInt();
        
       if (DS > 300) {
           System.out.println("Tien hoa hong: 20%");
       } else if (DS > 100) {
           System.out.println("Tien hoa hong: 10%");
       } else {
           System.out.println("Tien hoa hong: 5%");
       }
    }
}

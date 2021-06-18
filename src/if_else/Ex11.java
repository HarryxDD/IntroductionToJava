/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/* Nhà bạn hàng tháng phải đóng tiền điện và được tính như sau:
Từ 0 - 50 kwh				đơn giá 1 480 vnđ/kwh
Từ 51 kwh trở đi đến 100 kwh 		đơn giá 1 500 vnđ/kwh
Từ 101 kwh trở đi đến 200 kwh 		đơn giá 1 700 vnđ/kwh
Từ 201 kwh trở lên		 		đơn giá 2 800 vnđ/kwh
	Viết chương trình nhập vào tổng số kwh điện đã dùng và tính số tiền phải trả? 	
 *
 * @author Ame
 */
public class Ex11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your electric used is ");
        int used = sc.nextInt();
        int pay;
        if (used <= 50)
        {
            pay = used * 1480;
        }
        else if (used <= 100) 
        {
            pay = 50 * 1480;
            used = used - 50;
            pay = pay + used * 1500;
        }
        else if (used <= 200)
        {
            pay = 50 * 1480;
            pay = pay + 50 * 1500;
            used = used - 100;
            pay = pay + used * 1700;
        }
        else 
        {
            pay = 50 * 1480;
            pay = pay + 50 * 1500;
            pay = pay + 100 * 1700;
            used = used - 200;
            pay = pay + used * 2800;
        }
        System.out.println("You need to pay "+ pay);
    }
}

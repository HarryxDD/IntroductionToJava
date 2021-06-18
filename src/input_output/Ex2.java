/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

/*
 *
 * 2.	Viết chương trình in ra màn hình thông tin của bạn có cấu trúc như sau
	------------------------------------------------------------------------
			Tran Van Tuan
			Age 20
			120 Phan Chau Trinh, Da Nang
	------------------------------------------------------------------------

 */
public class Ex2 {
    public static void main(String[] args)
    {
        String name = "Tran Van Tuan";
        int age = 20;
        String address = "120 Phan Chau Trinh, Da Nang";
        
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("%-20s %-5s \n","", name);
        System.out.printf("%-20s %-5s \n","", age);
        System.out.printf("%-20s %-5s \n","", address);
        System.out.println("------------------------------------------------------------------------");

        
    }
}

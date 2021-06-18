/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.util.Scanner;

/**
 *
 * @author ame dep trai
 */

/* Bai tap 
    1.	Nhập xuất
●	Nhập vào số  kiểu int và in ra màn hình
●	Nhập vào số kiểu short và in ra màn hình
●	Nhập vào số kiểu byte và in ra màn hình
●	Nhập vào số kiểu long và in ra màn hình
●	Nhập vào số kiểu float và in ra màn hình
●	Nhập vào số kiểu double và in ra màn hình
●	Nhập vào một chuỗi và in ra màn hình (dùng next())
●	Nhập và in ra họ tên của bạn (dùng nextline())

*/
public class Ex1 {
    public static void main(String[] args){
        //Nhập vào số  kiểu int và in ra màn hình
        int motSoInt;
        
        System.out.print("Nhap zo <3: ");
        Scanner sc = new Scanner(System.in);
        motSoInt = sc.nextInt();

        System.out.println("so kieu int: " + motSoInt);
        
        
        //Nhập vào số kiểu short và in ra màn hình
        short motSoShort;
        
        sc.nextLine();
        System.out.print("Nhap so short zo di anh oi: ");
        motSoShort = sc.nextShort();
        
        System.out.println("so kieu short: " + motSoShort);
        
        //Nhập vào số kiểu byte và in ra màn hình
        byte motSoByte;
        
        sc.nextLine();
        System.out.print("Nhap so byte zo di anh oi: ");
        motSoByte = sc.nextByte();
        
        System.out.println("so kieu byte: " + motSoByte);
        
        //Nhập vào số kiểu long và in ra màn hình
        long motSoLong;
        
        sc.nextLine();
        System.out.print("Nhap so long zo di anh oi: ");
        motSoLong = sc.nextLong();
        
        System.out.println("so kieu long: " + motSoLong);
        
        //Nhập vào số kiểu float và in ra màn hình
        float motSoFloat;
        
        sc.nextLine();
        System.out.print("Nhap so float zo di anh oi: ");
        motSoFloat = sc.nextFloat();
        
        System.out.println("so kieu float: " + motSoFloat);
        
        //Nhập vào số kiểu double và in ra màn hình
        double motSoDouble;
        
        sc.nextLine();
        System.out.print("Nhap so double zo di anh oi: ");
        motSoDouble = sc.nextDouble();
        
        System.out.println("so kieu double: " + motSoDouble);
        
        //Nhập vào chuoi và in ra màn hình
        String motChuoi;
        
        sc.nextLine();
        System.out.print("Nhap chuoi zo di anh oi: ");
        motChuoi = sc.next();
        
        System.out.println("mot chuoi: " + motChuoi);
        
        //Nhập vào chuoi và in ra màn hình
        String yourName;
        
        sc.nextLine();
        System.out.print("Nhap ten cua ban: ");
        yourName = sc.nextLine();
        
        System.out.println("ten cua ban: " + yourName);
        
    }
    
}

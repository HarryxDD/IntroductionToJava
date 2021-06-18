/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else.Switch;

import java.util.Scanner;

/* Nhập vào ký tự A →  F hoặc a →  f. In ra học lực như sau:
	A hoặc a	: Excellent
	B hoặc b	: Good
	C hoặc c	: Pretty good
	D hoặc d	: Average
	F hoặc f	: Failed
	Ký tự khác	: UNKNOWN
 *
 * @author Ame
 */
public class Ex5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao ky tu: ");
        char ch = sc.next().charAt(0);
        
        switch(ch) {
            case 'A': 
            case 'a':
                System.out.println("Excellent");
                break;
            case 'B': 
            case 'b':    
                System.out.println("Good");
                break;
            case 'C': 
            case 'c':    
                System.out.println("Pretty good");
                break;
            case 'D': 
            case 'd':    
                System.out.println("Average");
                break;
            case 'F': 
            case 'f':    
                System.out.println("Failed");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}

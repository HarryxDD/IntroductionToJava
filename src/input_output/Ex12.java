/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.util.Calendar;
import java.util.Scanner;

/* Viết chương trình nhập vào năm sinh. In ra số tuổi
Ví dụ nhập 2000
Ban sinh nam 2000, nam nay ban 18 tuoi
 *
 * @author Ame
 */
public class Ex12 {
    public static void main(String[] args) {
        
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap nam sinh cua ban: ");
        int year = input.nextInt();
        
        System.out.println("Ban sinh nam " + year + ", nam nay ban " + (currentYear - year) + " tuoi");

    }
}

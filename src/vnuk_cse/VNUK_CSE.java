/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vnuk_cse;

import java.util.Scanner;

/**
 *
 * @author Ame
 */
public class VNUK_CSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*System.out.println("Toi ten la: Nguyen Van A");
        System.out.println("Tuoi: 21");
        
        String name = "Truong Pham Tuan Nguyen";
        String age = "ngua";
        float tall = 1.6f;
        System.out.println("Toi ten la: " + name + ". Tuoi: " + age );
        System.out.printf("Toi ten la: %s. Tuoi: %s. Cao: %.1f m", name, age, tall);
        System.out.println();
        String ID = "001";
        name = "Ngo Anh";
        int agee = 20;
        System.out.printf("%-5s %-15s %-5s","ID","name","age");
        System.out.println();
        System.out.printf("%-5s %-15s %-5d",ID,name,agee);
        */
        
        
        //Scanner input = new Scanner(System.in);
        
        Scanner sc = new Scanner(System.in);
        
        String name;
        int age;
        String address;
        
        System.out.print("Name: ");
        name = sc.nextLine();
        
        System.out.print("Age: ");
        age = sc.nextInt();

        sc.nextLine();
        System.out.print("Address: ");
        address = sc.nextLine();
        
        System.out.println("\n" + name + "\n" + age + "\n" +address);
        
    }
    
}

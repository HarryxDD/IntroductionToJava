/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

/**
 *
 * @author Ame
 */
public class MethodDemo {

    static int add(int a, int b) {
        return a + b;
    }

    static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return false;
    }

    static int increase(int a) {
        a += 1;
        return a;
    }
    
    public static void main(String[] args) {
        add(10, 20);
        int s = add(100, 200); 
        System.out.println("sum: " + s);
        
        int n = 4;
        if (isPrimeNumber(n)) {
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n + " is not prime number");
        }
    }
}

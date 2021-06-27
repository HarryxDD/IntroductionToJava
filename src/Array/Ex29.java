/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Random;

/* Cho mảng một chiều n phần tử, viết hàm tạo ra mảng một chiều n phần tử có các phần tử là từ mảng đã cho và sắp xếp vị trí ngẫu nhiên
 *
 * @author Ame
 */
public class Ex29 {
    
    static void printArray(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        
    }
    
    static int[] randomArr(int[] array) {
        Random rand = new Random();
        
        int[] ranArr = array.clone();
        
        for(int i = 0; i < ranArr.length; i++) {
            int ranIndex = rand.nextInt(array.length);
            int tmp = ranArr[i];
            ranArr[i] = ranArr[ranIndex];
            ranArr[ranIndex] = tmp;
        }
        
        return ranArr;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 9, 11, 7};
        
        System.out.println("Init array: ");
        printArray(array);
        
        int[] ranArr = randomArr(array);
        System.out.println("");
        System.out.println("New array: ");
        printArray(ranArr);
    }
}

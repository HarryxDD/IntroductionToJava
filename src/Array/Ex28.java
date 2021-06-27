/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Đếm các số phần tử xuất hiện hơn 1 lần trong mảng số nguyên  cho trước.
 	Ví dụ:
int a[]={2, 9, 0, 3, 2, 0, 1, 7}  Xuất ra: 2
int a[]={0, 1, 2, 3, 4, 5, 6 , 7}  Xuất ra: 0

 *
 * @author Ame
 */
public class Ex28 {
    
    static int isDuplicated(int[] array) {
   
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            try {
                map.put(array[i], map.get(array[i]) + 1);
            }
            catch (Exception e) {
                map.put(array[i], 1);
            }
        }
        
        int countDup = 0;
        
        for (Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                countDup++;
            }
        }
        
        return countDup++;
    }
    
    public static void main(String[] args) {
        int[] array = {2, 2, 2, 2, 2, 3, 3, 4, 4, 5, 7, 9, 7};
               
        System.out.println(isDuplicated(array));
        
    }
}

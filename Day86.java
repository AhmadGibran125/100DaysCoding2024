package Coding100day;

import java.util.Arrays;
public class Day86 {
    public static void main(String[] args) {
        int[] yaaa = {6,5,3,7,2,1,4,8};
        
        System.out.println(Arrays.toString(yaaa));
        
        yaaa[0] = 1;
        yaaa[1] = 2;
        yaaa[2] = 3;
        yaaa[3] = 4;
        yaaa[4] = 5;
        yaaa[5] = 6;
        yaaa[6] = 7;
        yaaa[7] = 8;
        
        System.out.println(yaaa[0]);
        System.out.println(yaaa[1]);
        System.out.println(yaaa[2]);
        System.out.println(yaaa[3]);
        System.out.println(yaaa[4]);
        System.out.println(yaaa[5]);
        System.out.println(yaaa[6]);
        System.out.println(yaaa[7]);
       
        
        for (int i = 0; i < yaaa.length; i++) {
            System.out.println("Elemen "+i+" : "+ yaaa[i]);
        }
    }
    
}

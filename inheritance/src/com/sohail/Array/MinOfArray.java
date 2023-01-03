package com.sohail.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinOfArray {
    public static void main(String[] args) {
        int[] age =new int[3];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i< age.length){
            age[i] = sc.nextInt();
            i++;
        }
        i=0;
        System.out.println(Arrays.toString(age));
        int min = Integer.MAX_VALUE;
        while(i<age.length){
            if(min>age[i]){
                min=age[i];

            }
            i++;
        }
        System.out.println(min);
    }
}

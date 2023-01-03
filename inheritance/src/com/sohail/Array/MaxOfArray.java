package com.sohail.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] age =new int[5];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i< age.length){
            age[i] = sc.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(age)); // Shortcut method for print an array

        i=0;
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        while(i<age.length){
            if(max<age[i]){
                max=age[i];
            }
            i++;
        }
        System.out.println(max);
    }
}

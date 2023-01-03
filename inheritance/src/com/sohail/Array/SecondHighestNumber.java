package com.sohail.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] age = {61, 30, 28, 47, 42, 25, 41, 56, 27, 45, 44, 34, 46, 35, 58, 36, 60, 29, 53, 55, 32, 31, 33, 59, 50, 51, 52, 37, 39, 38, 43, 49, 54, 57, 40, 26, 48};
//        Scanner sc = new Scanner(System.in);
        int i = 0;
//        while(i< age.length){
//            age[i] = sc.nextInt();
//            i++;
//        }

        int max = age[0];
        int secondMax =age[1];
        Arrays.sort(age);
        System.out.println(Arrays.toString(age));
        System.out.println(age.length);
        while(i<age.length){
            if(max<age[i]){
                secondMax = max;
                max=age[i];
            }
            i++;
        }
        System.out.println(secondMax);
    }
}

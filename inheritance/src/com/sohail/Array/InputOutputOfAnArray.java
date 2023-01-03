package com.sohail.Array;

import java.util.HashSet;
import java.util.Scanner;

public class InputOutputOfAnArray {
    public static void main(String[] args) {
        int noOfArrayElement;
        System.out.println("Please Enter the array element : ");
        Scanner sc = new Scanner(System.in);
        noOfArrayElement = sc.nextInt();
        int[] roll = new int[noOfArrayElement];
        System.out.println("Enter The Array Elements : ");
        for (int i = 0; i<noOfArrayElement;i++){
            roll[i] = sc.nextInt();
        }
        System.out.println("Array Elements are : ");
        for (int i = 0; i<noOfArrayElement;i++){
            System.out.println(roll[i]);
        }

        //###################### Hash Set -> Remove Repeatative Element ####################

        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println("Array Elements are using hashset: ");
        for (int i = 0; i<noOfArrayElement;i++){
            hashSet.add(roll[i]);
        }
            System.out.println(hashSet);

    }
}

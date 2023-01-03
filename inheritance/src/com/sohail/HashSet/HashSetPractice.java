package com.sohail.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetPractice {
    public static void main(String[] args) {
        int firstArrayElementNo;
        int secondArrayElementNo;
        Scanner sc = new Scanner(System.in);

        // First Array
        System.out.println("Enter the first array element : ");
        firstArrayElementNo = sc.nextInt();
        int[] arr1 = new int[firstArrayElementNo];
        System.out.println("Put first array elements : ");
        for(int i = 0;i<firstArrayElementNo;i++){
            arr1[i]=sc.nextInt();
        }

        // Second Array
        System.out.println("Enter the second array element : ");
        secondArrayElementNo = sc.nextInt();
        int[] arr2 = new int[secondArrayElementNo];
        System.out.println("Put second array elements : ");
        for(int i = 0;i<secondArrayElementNo;i++){
            arr2[i]=sc.nextInt();
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i =0; i<firstArrayElementNo;i++){
            hashSet.add(arr1[i]);
        }
        for (int i =0; i<firstArrayElementNo;i++){
            hashSet.add(arr2[i]);
        }
        System.out.println(hashSet);
    }
}

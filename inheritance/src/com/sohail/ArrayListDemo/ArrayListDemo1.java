package com.sohail.ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=0;i<7;i++){
            int n = sc.nextInt();
            list.add(n);
        }
        System.out.println(list);
    }
}

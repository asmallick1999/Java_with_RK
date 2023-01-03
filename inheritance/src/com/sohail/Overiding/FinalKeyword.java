package com.sohail.Overiding;

// final is same as const variable

import java.util.Scanner;

public class FinalKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        FinalKeyword obj1 = new FinalKeyword();
//        obj1.pie = 40.90f; cannot modify the final variable
        System.out.println("Area of Circle : "+obj1.areaOfCircle(r, obj1.pie));
    }
    public float areaOfCircle(int r, float pie){
        return pie*r*r;
    }
    final float pie = 3.14f;
}

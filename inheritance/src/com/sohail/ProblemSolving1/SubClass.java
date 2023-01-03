package com.sohail.ProblemSolving1;

import java.util.Scanner;

public class SubClass extends SuperClass{
    public static void main(String args[]){
        SubClass obj1 = new SubClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Heigth :");
        obj1.height = sc.nextInt();
        System.out.println("Enter the value of Width :");
        obj1.width = sc.nextInt();
        System.out.println("Enter the value of Length :");
        int length = sc.nextInt();

        int areaofCone = obj1.areaOfaCone(length);
        System.out.println("Area of a Cone: "+areaofCone);
    }
    public int areaOfaCone(int length) {
        int result = super.area(height, width);
        return result * length;
    }
}

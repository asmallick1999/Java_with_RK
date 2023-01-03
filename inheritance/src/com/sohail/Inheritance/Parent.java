package com.sohail.Inheritance;

import java.util.Scanner;

public class Parent {
//    public static void main(String args[]){
//        int math=0,physics=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks here: ");
//        math = sc.nextInt();
//        physics = sc.nextInt();
//        System.out.println("Marks : "+calculate(math,physics));
//        Parent obj1 = new Parent();
//        float aMarks = obj1.avgMarks(math,physics);
//        System.out.println("Average Marks: "+aMarks);
//    }
    public static int calculate(int math,int phy){
        return math+phy;
    }
    public float avgMarks(int math, int phy){
        return calculate(math,phy)/2;
    }
    Parent(){
        System.out.println("In Parent");
    }
}

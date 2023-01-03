package com.sohail.ProblemSolving2;

import java.util.Scanner;

public class SubClass extends SuperCalss{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height : ");
        int heigth = sc.nextInt();
        System.out.println("Enter the Width : ");
        int width = sc.nextInt();
        System.out.println("Enter the Length : ");
        int length = sc.nextInt();
        SubClass obj1 = new SubClass(heigth,width,length);
    }
    SubClass(int h, int w,int l){
        super(h,w);
        System.out.println("length : "+l);
    }
}

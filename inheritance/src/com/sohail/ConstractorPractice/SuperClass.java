package com.sohail.ConstractorPractice;

public class SuperClass {
//    public static void main(String args[]){
//        SuperClass obj1 = new SuperClass(96.5,70);
//        SuperClass obj2 = new SuperClass();
//    }
//    SuperClass(){
//        System.out.println("This is default constructor");
//    }
    SuperClass(int n1, int n2){
        int result = n1 + n2;
        System.out.println("this is from parameterize constractor : "+result);
    }
}

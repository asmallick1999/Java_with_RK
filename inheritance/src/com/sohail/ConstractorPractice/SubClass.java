package com.sohail.ConstractorPractice;

public class SubClass extends SuperClass{
    public static void main(String args[]){
        SubClass obj1 = new SubClass();
    }
    //Default Construtor
//    SubClass(){
//        System.out.println("this is from child class default const.");
//    }

    //Parameterize constructor
    SubClass(){
        super(50,40);
        System.out.println("Hello this is from child class");
    }
}

package com.sohail.Overiding;

public class ChildPractice extends Practice1{
    public static void main(String[] args) {
        ChildPractice obj1 = new ChildPractice();
        obj1.duchki();
    }
    public void duchki(){
        System.out.println("Hello this is duchki form child");

    }
}

package com.sohail.InheritancePractice;

public class SubClass {
    public static void main(String padu[]){
        SubClass obj1 = new SubClass();
        int result = obj1.SubFunction();
        System.out.println(result+dudu);

        //Accessing Super Class without using Inheritance

        SuperClass obj2 = new SuperClass();
        System.out.println(obj2.show());

        System.out.println(SuperClass.marks());

    }
    public int SubFunction(){
        return 30+50;
    }
    static int dudu = 40;

}

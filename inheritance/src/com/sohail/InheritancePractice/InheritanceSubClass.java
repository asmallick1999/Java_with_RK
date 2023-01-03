package com.sohail.InheritancePractice;

public class InheritanceSubClass extends SuperClass {
    public static void main(String hugu[]){
        InheritanceSubClass obj1 = new InheritanceSubClass();
        System.out.println(obj1.show());
        System.out.println(marks());
        System.out.println(45 + mutu);
        System.out.println(30 + obj1.vutu);
        System.out.println(obj1.InheritanceSubFunction());
        System.out.println(dudu);
    }
    public int InheritanceSubFunction(){
        return 30+50;
    }
    static int dudu = 40;
}

package com.sohail.TypeOfVariables;


public class SubClass {
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass();
        SubClass obj2 = new SubClass();

        //#############################Instance Variable
        System.out.println("This is Instance Variable : "+obj1.height);
        obj2.add();

        //################################## Class or Static Variable
        System.out.println("This is Class Variable : "+SuperClass.width);

    }
    public void add(){
        //############################## Local Variables
        int a=10,b=50;
        System.out.println("here a and b is local vaiable || addition : "+a+b);
    }
}

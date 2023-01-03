package com.sohail.Interface;

import com.sohail.Overiding.ChildPractice;

public class ChildClass implements ParentInterface, ParentInterface2 {
    public static void main(String[] args) {
        ChildClass obj1 = new ChildClass();
        obj1.add(num1,num2);
        obj1.multi(mul1,mul2);
    }

    @Override
    public void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Add Result : "+result);
    }



    @Override
    public void multi(int mul1, int mul2) {
        int result = num1 * num2;
        System.out.println("Mul Result : "+result);

    }
}

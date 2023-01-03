package com.sohail.ThisKeyword;

public class ThisKeyword {
    int input;
    private boolean isEvent(int input1){
        input1 = input;
        System.out.println(input1);
        return input1 % 2==0;
    }

    public static void main(String[] args) {

        ThisKeyword obj1 = new ThisKeyword();
        boolean output = obj1.isEvent(17);
        System.out.println(output);
    }
}

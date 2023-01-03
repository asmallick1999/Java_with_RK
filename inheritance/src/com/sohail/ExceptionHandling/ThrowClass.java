package com.sohail.ExceptionHandling;

public class ThrowClass {
    public static void main(String args[]){
        int x = 30, div = 0;
        try {
            int result = x/div;
            System.out.println(result);
            throw new ArithmeticException();
        }finally {
            System.out.println("Kuchi Puchi Puchki");
        }
//        catch (NullPointerException e){
//            e.printStackTrace();
//        }



    }
}

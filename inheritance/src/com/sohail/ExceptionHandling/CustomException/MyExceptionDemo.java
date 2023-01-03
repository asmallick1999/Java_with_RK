package com.sohail.ExceptionHandling.CustomException;

public class MyExceptionDemo {
    public static void main(String[] args)  {
        int x = 30, div = 0;
        try {
            throw new MyException();
        } catch (MyException e) {
            System.out.println("This is from catch");
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
//        finally {
//            System.out.println("Kuchi Puchi Puchki");
//        }
    }
}

package com.sohail.ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int num1 = 45;
        int zero = 0;
        String hagu = null;
        int[] arr = {20,40,50,60,70};
        try{
            System.out.println(hagu);
            System.out.println(arr[9]);
            int devive = num1/zero;
            System.out.println(devive);


        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("This is from finally");
        }
    }
}

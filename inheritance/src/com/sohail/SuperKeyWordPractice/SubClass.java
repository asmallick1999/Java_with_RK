package com.sohail.SuperKeyWordPractice;

public class SubClass extends SuperClass{
    public static void main(String sankarMama[]){
        SubClass obj1 = new SubClass();
//        System.out.println("Avg is : " +obj1.add(30,50)/2);
//        int num = obj1.add(40,60);
//        int result =  avg(num);
        int avg1 = obj1.avg();
        System.out.println("Avg : "+ avg1);

        // Super Keyword cannot be used in static method
    }
    public int avg(){
        int avg1 = super.add(80,40)/2;
        System.out.println(super.sutopaMasi);

        // This cannot be possible
//        System.out.println(super.rubina);
//        System.out.println(super.mul(80,30));

        return avg1;
    }
}

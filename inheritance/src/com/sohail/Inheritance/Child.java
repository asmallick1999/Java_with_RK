package com.sohail.Inheritance;

public class Child extends Parent{
    public static void main(String args[]){
        //System.out.println(calculate(30,40));

        // ########### Calling Default Constructor #############
//        Child obj1 = new Child();
//        System.out.println(obj1.kola);

        // ########### Calling Parameratized Constructor #############
//        Child obj2 = new Child(40,50);

//        Parent obj2 = new Parent();
//        System.out.println("Avg Marks: "+obj2.avgMarks(30,80));
    }

//    ##################### Default Constructor ###################
    Child(){
        System.out.println("In Child");
    }


    //    ##################### Parameratized Constructor ###################

//    Child(int rubi, int piyara){
//        System.out.println(rubi+piyara);
//    }
    //public int kola = 40;
}

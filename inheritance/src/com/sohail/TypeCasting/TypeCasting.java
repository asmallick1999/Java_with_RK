package com.sohail.TypeCasting;

// Data types in java

//Widening Type Casting
// Byte-> Short -> Char -> Int -> Long -> Float -> Double --------- also called Implicit type casting (Automatically)

//Narrowing Type Casting
// Byte<- Short <- Char <- Int <- Long <- Float <- Double --------- also called Explicit type casting

public class TypeCasting {
    public static void main(String[] args) {
        long int1 = 30L, int2= 40L;
        double double1 = 35.5, double2 = 55.7;
        TypeCasting obj1 = new TypeCasting();
        obj1.implicitTypeCasting(int1,int2);
        obj1.explicitTypeCasting(double1,double2);
    }
    public void implicitTypeCasting(Long n1, Long n2){    // Implicit
        double result= n1 + n2;
        System.out.println(result);
    }
    public void explicitTypeCasting(double double1, double double2){    // Explicit
        long long3 = (long)(double1+double2);
        System.out.println(long3);
    }
}

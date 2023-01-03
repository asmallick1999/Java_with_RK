package com.sohail.Overiding;

public class Practice1 {
    public static void main(String[] args) {
        Practice1 obj1 = new Practice1();
        obj1.duchki();
    }
    final int i =1;
    public void duchki(){
        System.out.println("Hello this is duchki from parent");

    }
}

//########################## final Keyword ############################

//final keyword is used to avoid override, it's like a const variable

//    public final void duchki(){
//        System.out.println("Hello this is duchki from parent");
//        i = 2;
//        System.out.println("The value of i :"+i);
//    }
//}



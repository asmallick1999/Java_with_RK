package com.sohail.List;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();

        int i = 0;
        while(i< 5){
            myList.add(sc.nextInt());
            i++;
        }


        List<Integer> outputSecondMax = secondMax(myList);
        System.out.println(outputSecondMax.get(0));
        System.out.println(outputSecondMax.get(1));
    }

    public static List<Integer> secondMax(List<Integer> myListFunction){
        List<Integer> returnList = new ArrayList<>();

        System.out.println(myListFunction);
        int i=0;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        while(i<myListFunction.size()){
            if(max< myListFunction.get(i)){
                secondMax=max;
                max= myListFunction.get(i);
            }
            i++;
        }

        returnList.add(max);
        returnList.add(secondMax);
        return returnList;

    }
}

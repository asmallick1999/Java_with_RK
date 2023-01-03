package com.sohail.GFG;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {3,5,2,7,8,3,5,1,0};
        //to remove repeating element from array we use set

        //ONE WAY

//        HashSet<Integer> myHashSet = new HashSet<>();
//        for(int i=0;i<arr.length;i++){
//            myHashSet.add(arr[i]);
//        }
//        System.out.println(myHashSet);

        List<Integer> puchkiList = new ArrayList<>();
        int i=0;
        while(i<arr.length){
            if(puchkiList.get(i)!=arr[i]){
                puchkiList.add(arr[i]);
            }
            i++;
        }
        System.out.println(puchkiList);
    }
}

package com.assignment.task6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Program to find the intersection of
//two arrays in java?
public class Programming2 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        int[] arr2= {2,3,6,7};

        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for( int num:arr){
            set.add(num);
        }
        for(int num:arr2){
            if(set.contains(num)){
                intersection.add(num);
            }
        }
        Iterator<Integer> it = intersection.iterator() ;
        while(it.hasNext()){
            System.out.println(it.next() + ",");
        }

    }

}

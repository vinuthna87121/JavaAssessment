package com.assignment.task4;

import java.util.HashSet;
import java.util.Set;

//Write a Java program to find the sum
//of the two elements of a given array
//which is equal to a given integer.
//a. Sample array: [1,2,4,5,6]
//b. Target value: 6
public class Arrays6 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6};
        int target=6;
        Set<Integer> set = new HashSet<>();
        for(int num:arr){
            int complement = target -num;
            if(set.contains(complement)){
                System.out.println(num + "," + complement);

            }
            set.add(num);
        }


    }
}

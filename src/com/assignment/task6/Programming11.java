package com.assignment.task6;

import java.util.Arrays;

//.Program to find all the subarray
//whose sum is equal to the given
//number?
public class Programming11 {
    public static void main(String[] args) {
        int [] num = {1,2,3,0,1,1,1,12,34};
        int target =3;
        printSubArrays(num,target);


    }
    private static void printSubArrays(int[] num,int target){

        for(int start =0;start<num.length;start++){
            int sum =0;
            for(int end = start;end<num.length;end++){
                sum += num[end];
                if(sum == target){
                    System.out.println(Arrays.toString(Arrays.copyOfRange(num,start,end+1)));
                }
            }
        }


    }
}

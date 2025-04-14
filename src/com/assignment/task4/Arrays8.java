package com.assignment.task4;

public class Arrays8 {
    public static void main(String[] args) {
        //Given an array of n integers, find
        //the third largest element. All the
        //elements in the array are distinct
        //integers.
        //Input: arr[] = {1, 16, 2, 19, 10, 20}
        //Output: The third Largest element is
        //16
        int[]arr={1,16,2,19,10,20};

        int first= Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        for(int array:arr){
            if(array>first){
                third= second;
                second=first;
                first=array;
            } else if (array>second && array<first) {
                third = second ;
                second = array;

            } else if (array<second&&array>third) {
                third =array;

            }
        }System.out.print(third + " is the third largest");


    }
}

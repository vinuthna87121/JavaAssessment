package com.assignment.task6;
//Find the maximum value in Array
//without using Collection?
public class Programming8 {
    public static void main(String[] args) {


        int[] num = {1, 2, 3, 4,12,0,24,56,32,45,90,100,200,120};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(num[i]>max){
                max = num[i];


            }

        }System.out.print(max + " is max");
    }
}

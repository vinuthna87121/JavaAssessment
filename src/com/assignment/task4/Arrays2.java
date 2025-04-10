package com.assignment.task4;
//Program to Calculate Average Using Arrays
public class Arrays2 {
    public static void main(String[] args) {
        double[] num = {10,20,33.3,11.5,67.3};
        double sum =0;
        for(double nums:num){
            sum = sum + nums;
        }
        double average = sum/num.length;
        System.out.print("The average is:" + sum);

    }
}

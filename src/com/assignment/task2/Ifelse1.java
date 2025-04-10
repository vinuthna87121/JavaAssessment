package com.assignment.task2;

import java.util.Scanner;

/*Write a program to check whether a
number is positive or negative.*/
public class Ifelse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        double num= sc.nextDouble();
        if(num<0){
            System.out.println( "negative");
        }else if(num>0) {
            System.out.println( "positive");
        } else {
            System.out.println( "num is 0");
        }

    }
}
